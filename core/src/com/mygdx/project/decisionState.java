package com.mygdx.project;


import java.util.ArrayList;

/**
 * Created by Keenan Baynard on 1/5/2017.
 */
public class decisionState {

    double probWinPreFlop;
    double probWinFlop;
    double probWinTurn;
    double probWinRiver;
    double playerHandValueProbGuess;

    double opponentOddsPreFlop;
    double opponentOddsFlop;
    double opponentOddsTurn;
    double opponentOddsRiver;
    double opponentOdds;
    String bettingStrategy;

    double handValue;
    Player computer;
    Player player;

    getProbAndSave probAndSave;
    gettingData getData;
    winTest winTest;

    public void getDecision(double handValue, Player computer, ArrayList<Card> table, Player player) {

        this.handValue = handValue;
        this.computer = computer;
        this.player = player;

        probAndSave = new getProbAndSave();
        getData = new gettingData();
        winTest = new winTest(table);
        winTest.handCheck();


        probWinPreFlop = probAndSave.getWinProb(handValue, "preflop");
        probWinFlop = probAndSave.getWinProb(handValue, "flop");
        probWinTurn = probAndSave.getWinProb(handValue, "turn");
        probWinRiver = probAndSave.getWinProb(handValue, "river");


        getData.handStrengthGivenTableStrengthAndAction(winTest.player.handValue, globalVariables.playState, globalVariables.cardState);
        playerHandValueProbGuess = getData.handProbabilityMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        System.out.println("Probable Hand: " + playerHandValueProbGuess);


        opponentOddsPreFlop = probAndSave.getWinProb(playerHandValueProbGuess, "preflop");
        opponentOddsFlop = probAndSave.getWinProb(playerHandValueProbGuess, "flop");
        opponentOddsTurn = probAndSave.getWinProb(playerHandValueProbGuess, "turn");
        opponentOddsRiver = probAndSave.getWinProb(playerHandValueProbGuess, "river");

        switch (globalVariables.cardState) {
            case "preflop":
                opponentOdds = opponentOddsPreFlop;
                break;
            case "flop":
                opponentOdds = opponentOddsFlop;
                break;
            case "turn":
                opponentOdds = opponentOddsTurn;
                break;
            case "river":
                opponentOdds = opponentOddsRiver;
        }

        if (opponentOdds < 0.2) {
            bettingStrategy = "0/0";
        }
        if (0.2 < opponentOdds && opponentOdds < 0.4) {
            bettingStrategy = "0/1";
        }
        if (0.4 < opponentOdds && opponentOdds < 0.6) {
            bettingStrategy = "1/2";
        }
        if (0.6 < opponentOdds && opponentOdds < 0.8) {
            bettingStrategy = "2/3";
        }
        if (0.8 <= opponentOdds) {
            bettingStrategy = "3/4";
        }

        System.out.println(bettingStrategy);
        //Computer goes second

        switch (globalVariables.cardState) {
            case "preflop":
                if (!globalVariables.smallBlind.equals("computer")) {
                    switch (globalVariables.playState) {
                        case "raise":
                            if (probWinPreFlop > 0.5)
                                if (globalVariables.betAmount > 100 && globalVariables.betAmount < 400) {
                                    call();
                                    globalVariables.cardState = "flop";
                                } else if (globalVariables.betAmount >= 400)
                                    fold();
                                else
                                    raise(probWinPreFlop);
                                //player turn again
                            else if (globalVariables.betAmount > 100)
                                fold();
                            else {
                                call();
                                globalVariables.cardState = "flop";
                            }
                            break;
                        case "check":
                            if (probWinPreFlop <= .5) {
                                check();
                                globalVariables.cardState = "flop";
                            } else if (probWinPreFlop > .5)
                                raise(probWinPreFlop);
                            //player turn again
                            break;
                        case "":
                            //check
                            if (probWinPreFlop<0.6) {
                                check();
                                globalVariables.cardState = "flop";
                            }
                            //raise
                            if (probWinFlop>=0.6){
                                raise(probWinPreFlop);
                            }
                            break;
                    }
                } else {
                    //raise
                    if (probWinPreFlop >= .6) {
                        raise(probWinPreFlop);
                    }
                    //call blind
                    if (probWinPreFlop <= .6) {
                        if (!globalVariables.playState.equals("")) {
                            globalVariables.cardState = "flop";
                        }
                        call();
                    }
                }
                break;
            case "flop":
                switch (globalVariables.playState) {
                    case ("raise"):
                        //raise
                        if (probWinFlop >= .7) {
                            if (globalVariables.betAmount > 100 && globalVariables.betAmount < 400) {
                                call();
                                globalVariables.cardState = "turn";
                            } else if (globalVariables.betAmount >= 400)
                                fold();
                            else
                                raise(probWinFlop);
                        }
                        //call
                        else if (probWinFlop >= .5) {
                            call();
                            globalVariables.cardState = "turn";
                        }
                        //fold
                        else if (probWinFlop < .5) {
                            fold();
                        }
                        break;
                    case ("check"):
                        //raise
                        if (probWinFlop >= .5) {
                            raise(probWinFlop);
                        }
                        //check
                        else if (probWinFlop < .5) {
                            check();
                            globalVariables.cardState = "turn";
                        }
                        break;
                    case "":
                        //raise
                        if (probWinFlop >= .5) {
                            raise(probWinRiver);
                        }
                        //check
                        else if (probWinFlop < .5) {
                            check();
                        }
                        break;
                }
                break;
            case "turn":
                switch (globalVariables.playState) {
                    case ("raise"):
                        //raise
                        if (probWinFlop >= .7) {
                            if (globalVariables.betAmount > 100 && globalVariables.betAmount < 400) {
                                call();
                                globalVariables.cardState = "river";
                            } else if (globalVariables.betAmount >= 400)
                                fold();
                            else
                                raise(probWinTurn);
                        }
                        //call
                        else if (probWinFlop >= .5) {
                            call();
                            globalVariables.cardState = "river";
                        }
                        //fold
                        else if (probWinFlop < .5) {
                            fold();
                        }
                        break;
                    case ("check"):
                        //raise
                        if (probWinFlop >= .5) {
                            raise(probWinTurn);
                        }
                        //check
                        else if (probWinFlop < .5) {
                            check();
                            globalVariables.cardState = "river";
                        }
                        break;
                    case "":
                        //raise
                        if (probWinFlop >= .5) {
                            raise(probWinRiver);
                        }
                        //check
                        else if (probWinFlop < .5) {
                            check();
                        }
                        break;
                }
                break;
            case "river":
                switch (globalVariables.playState) {
                    case ("raise"):
                        //raise
                        if (probWinFlop >= .7) {
                            if (globalVariables.betAmount > 100 && globalVariables.betAmount < 400) {
                                call();
                                globalVariables.cardState = "end";
                            } else if (globalVariables.betAmount >= 400)
                                fold();
                            else
                                raise(probWinRiver);
                        }
                        //call
                        else if (probWinFlop >= .5) {
                            call();
                            globalVariables.cardState = "end";
                        }
                        //fold
                        else if (probWinFlop < .5) {
                            fold();
                        }
                        break;
                    case ("check"):
                        //raise
                        if (probWinFlop >= .5) {
                            raise(probWinRiver);
                        }
                        //check
                        else if (probWinFlop < .5) {
                            check();
                            globalVariables.cardState = "end";
                        }
                        break;
                    case "":
                        //raise
                        if (probWinFlop >= .5) {
                            raise(probWinRiver);
                        }
                        //check
                        else if (probWinFlop < .5) {
                            check();
                        }
                        break;
                }
                break;
        }
    }


    public void call() {
        computer.playerMoney -= globalVariables.betAmount;
        globalVariables.potValue += globalVariables.betAmount;
        globalVariables.playState = "call";
        globalVariables.computerAction = "call";
        globalVariables.betAmount = 0;
    }

    public void fold() {
        globalVariables.playState = "fold";
        globalVariables.computerAction = "fold";
    }

    public void check() {
        if (globalVariables.smallBlind.equals("player")&&globalVariables.cardState.equals("preflop")){
            globalVariables.playState="";
            globalVariables.computerAction="";
        } else {
            globalVariables.playState = "check";
            globalVariables.computerAction = "check";
        }
    }

    public void raise(double probwin) {
        double amount = ((probwin * computer.playerMoney)) - ((1 - probwin) * globalVariables.potValue);
        double playerbet = globalVariables.betAmount;
        globalVariables.betAmount = amount;
        globalVariables.computerAction = "raise $" + amount;
        if (globalVariables.betAmount != 0) {
            amount += playerbet;
        }
        computer.playerMoney -= amount;
        globalVariables.potValue += amount;
        globalVariables.playState = "raise";
    }
}
