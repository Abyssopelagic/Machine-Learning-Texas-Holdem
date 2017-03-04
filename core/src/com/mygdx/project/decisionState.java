package com.mygdx.project;


import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Keenan Baynard on 1/5/2017.
 */
public class decisionState {

    double probWinPreFlop;
    double probWinFlop;
    double probWinTurn;
    double probWinRiver;
    double probWin;

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

        System.out.println("Computer Cards: " + computer.hand.get(0).value + " of " + computer.hand.get(0).suit + ", " + computer.hand.get(1).value + " of " + computer.hand.get(1).suit);

        if (globalVariables.smallBlind.equals("computer") && globalVariables.cardState.equals("preflop") && globalVariables.playState.equals("")) {

        } else if (table.size() != 0) {
            getData.handStrengthGivenTableStrengthAndAction(winTest.player.handValue, globalVariables.playState, globalVariables.cardState);
            playerHandValueProbGuess = getData.handProbabilityMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
            System.out.println(globalVariables.cardState + " probable Hand: " + playerHandValueProbGuess);


            opponentOddsPreFlop = probAndSave.getWinProb(playerHandValueProbGuess, "preflop");
            opponentOddsFlop = probAndSave.getWinProb(playerHandValueProbGuess, "flop");
            opponentOddsTurn = probAndSave.getWinProb(playerHandValueProbGuess, "turn");
            opponentOddsRiver = probAndSave.getWinProb(playerHandValueProbGuess, "river");

            switch (globalVariables.cardState) {
                case "preflop":
                    opponentOdds = opponentOddsPreFlop;
                    probWin = probWinPreFlop;
                    break;
                case "flop":
                    opponentOdds = opponentOddsFlop;
                    probWin = probWinFlop;
                    break;
                case "turn":
                    opponentOdds = opponentOddsTurn;
                    probWin = probWinTurn;
                    break;
                case "river":
                    opponentOdds = opponentOddsRiver;
                    probWin = probWinRiver;
            }

            if (Math.abs(opponentOdds - probWin) < 0.1) {
                bettingStrategy = "1/2";
            }
            if (0.1 < Math.abs(opponentOdds - probWin) && Math.abs(opponentOdds - probWin) < 0.2) {
                if (probWin > opponentOdds) {
                    bettingStrategy = "1/2";
                } else {
                    bettingStrategy = "0/1";
                }
            }
            if (0.2 < Math.abs(opponentOdds - probWin) && Math.abs(opponentOdds - probWin) < 0.3) {
                if (probWin > opponentOdds) {
                    bettingStrategy = "2/3";
                } else {
                    bettingStrategy = "0/1";
                }
            }
            if (0.3 < Math.abs(opponentOdds - probWin) && Math.abs(opponentOdds - probWin) < 0.4) {
                if (probWin > opponentOdds) {
                    bettingStrategy = "3/4";
                } else {
                    bettingStrategy = "0/0";
                }
            }
            if (0.5 <= Math.abs(opponentOdds - probWin)) {
                if (probWin > opponentOdds) {
                    bettingStrategy = "3/4";
                } else {
                    bettingStrategy = "0/0";
                }
            }

            System.out.println(bettingStrategy);
        }


        switch (globalVariables.cardState) {
            case "preflop":
                if (!globalVariables.smallBlind.equals("computer") || globalVariables.smallBlind.equals("computer") && globalVariables.cardState.equals("preflop") && !globalVariables.playState.equals("")) {
                    switch (globalVariables.playState) {
                        case "raise":
                            if (probWinPreFlop > 0.8) {
                                raise(probWinPreFlop);
                                //player turn again
                            } else if (probWinPreFlop < 0.2) {
                                fold();
                            } else {
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
                            if (probWinPreFlop < 0.5) {
                                check();
                                globalVariables.cardState = "flop";
                            }
                            //raise
                            if (probWinPreFlop >= 0.5) {
                                raise(probWinPreFlop);
                            }
                            break;
                    }
                } else {
                    //raise
                    if (probWinPreFlop >= .5) {
                        raise(probWinPreFlop);
                    }
                    //call blind
                    if (probWinPreFlop <= .5) {
                        if (!globalVariables.playState.equals("")) {
                            globalVariables.cardState = "flop";
                        }
                        call();
                    }
                }
                break;
            case "flop":
                switch (bettingStrategy) {
                    case "0/0":
                        if (globalVariables.playState.equals("raise")) {
                            fold();
                        } else {
                            check();
                            if (globalVariables.smallBlind.equals("computer")) {
                                globalVariables.cardState = "turn";
                            }
                        }
                        break;
                    case "0/1":
                        if (globalVariables.playState.equals("raise")) {
                            call();
                            globalVariables.cardState="end";
                        } else {
                            check();
                            if (globalVariables.smallBlind.equals("computer")) {
                                globalVariables.cardState = "turn";
                            }
                        }
                        break;
                    case "1/2":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 1) {
                                call();
                                globalVariables.cardState = "turn";

                            } else {
                                fold();
                            }
                        } else {
                            raise(probWin);
                            globalVariables.numberOfRaises++;
                        }
                        break;
                    case "2/3":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            } else if (globalVariables.numberOfRaises == 2) {
                                call();
                                globalVariables.cardState = "turn";
                            } else {
                                fold();

                            }
                        } else {
                            if (globalVariables.numberOfRaises < 1) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            }
                        }
                        break;
                    case "3/4":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            } else if (globalVariables.numberOfRaises == 2) {
                                call();
                                globalVariables.cardState = "turn";

                            } else {
                                fold();
                            }
                        } else {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            }
                        }
                        break;
                }
                break;
            case "turn":
                switch (bettingStrategy) {
                    case "0/0":
                        if (globalVariables.playState.equals("raise")) {
                            fold();
                        } else {
                            check();
                            if (globalVariables.smallBlind.equals("computer")) {
                                globalVariables.cardState = "river";
                            }
                        }
                        break;
                    case "0/1":
                        if (globalVariables.playState.equals("raise")) {
                            call();
                            globalVariables.cardState="end";
                        } else {
                            check();
                            if (globalVariables.smallBlind.equals("computer")) {
                                globalVariables.cardState = "river";
                            }
                        }
                        break;
                    case "1/2":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 1) {
                                call();
                                globalVariables.cardState = "river";

                            } else {
                                fold();
                            }
                        } else {
                            raise(probWin);
                            globalVariables.numberOfRaises++;
                        }
                        break;
                    case "2/3":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            } else if (globalVariables.numberOfRaises == 2) {
                                call();
                                globalVariables.cardState = "river";

                            } else {
                                fold();
                            }
                        } else {
                            if (globalVariables.numberOfRaises < 1) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            }
                        }
                        break;
                    case "3/4":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            } else if (globalVariables.numberOfRaises == 2) {
                                call();
                                globalVariables.cardState = "river";

                            } else {
                                fold();
                            }
                        } else {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            }
                        }
                        break;
                }
                break;
            case "river":
                switch (bettingStrategy) {
                    case "0/0":
                        if (globalVariables.playState.equals("raise")) {
                            fold();
                        } else {
                            check();
                            if (globalVariables.smallBlind.equals("computer")) {
                                globalVariables.cardState = "end";
                            }
                        }
                        break;
                    case "0/1":
                        if (globalVariables.playState.equals("raise")) {
                            call();
                            globalVariables.cardState="end";
                        } else {
                            check();
                            if (globalVariables.smallBlind.equals("computer")) {
                                globalVariables.cardState = "end";
                            }
                        }
                        break;
                    case "1/2":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 1) {
                                call();
                                globalVariables.cardState = "end";

                            } else {
                                fold();

                            }
                        } else {
                            raise(probWin);
                            globalVariables.numberOfRaises++;
                        }
                        break;
                    case "2/3":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            } else if (globalVariables.numberOfRaises == 2) {
                                call();
                                globalVariables.cardState = "end";

                            } else {
                                fold();

                            }
                        } else {
                            if (globalVariables.numberOfRaises < 1) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            }
                        }
                        break;
                    case "3/4":
                        if (globalVariables.playState.equals("raise")) {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            } else if (globalVariables.numberOfRaises == 2) {
                                call();
                                globalVariables.cardState = "end";

                            } else {
                                fold();

                            }
                        } else {
                            if (globalVariables.numberOfRaises < 2) {
                                raise(probWin);
                                globalVariables.numberOfRaises++;
                            }
                        }
                        break;
                }
                break;
        }
        //            case "flop":
//                switch (globalVariables.playState) {
//                    case ("raise"):
//                        //raise
//                        if (probWinFlop >= .7) {
//                            if (globalVariables.betAmount > 100 && globalVariables.betAmount < 400) {
//                                call();
//                                globalVariables.cardState = "turn";
//                            } else if (globalVariables.betAmount >= 400)
//                                fold();
//                            else
//                                raise(probWinFlop);
//                        }
//                        //call
//                        else if (probWinFlop >= .5) {
//                            call();
//                            globalVariables.cardState = "turn";
//                        }
//                        //fold
//                        else if (probWinFlop < .5) {
//                            fold();
//                        }
//                        break;
//                    case ("check"):
//                        //raise
//                        if (probWinFlop >= .5) {
//                            raise(probWinFlop);
//                        }
//                        //check
//                        else if (probWinFlop < .5) {
//                            check();
//                            globalVariables.cardState = "turn";
//                        }
//                        break;
//                    case "":
//                        //raise
//                        if (probWinFlop >= .5) {
//                            raise(probWinRiver);
//                        }
//                        //check
//                        else if (probWinFlop < .5) {
//                            check();
//                        }
//                        break;
//                }
//                break;
//            case "turn":
//                switch (globalVariables.playState) {
//                    case ("raise"):
//                        //raise
//                        if (probWinFlop >= .7) {
//                            if (globalVariables.betAmount > 100 && globalVariables.betAmount < 400) {
//                                call();
//                                globalVariables.cardState = "river";
//                            } else if (globalVariables.betAmount >= 400)
//                                fold();
//                            else
//                                raise(probWinTurn);
//                        }
//                        //call
//                        else if (probWinFlop >= .5) {
//                            call();
//                            globalVariables.cardState = "river";
//                        }
//                        //fold
//                        else if (probWinFlop < .5) {
//                            fold();
//                        }
//                        break;
//                    case ("check"):
//                        //raise
//                        if (probWinFlop >= .5) {
//                            raise(probWinTurn);
//                        }
//                        //check
//                        else if (probWinFlop < .5) {
//                            check();
//                            globalVariables.cardState = "river";
//                        }
//                        break;
//                    case "":
//                        //raise
//                        if (probWinFlop >= .5) {
//                            raise(probWinRiver);
//                        }
//                        //check
//                        else if (probWinFlop < .5) {
//                            check();
//                        }
//                        break;
//                }
//                end"
    }


    public void call() {
        computer.playerMoney -= globalVariables.betAmount;
        globalVariables.potValue += globalVariables.betAmount;
        globalVariables.playState = "call";
        globalVariables.computerAction = "call";
        globalVariables.betAmount = 0;
        globalVariables.numberOfCalls = 0;
        globalVariables.numberOfRaises = 0;
    }

    public void fold() {
        globalVariables.playState = "fold";
        globalVariables.computerAction = "fold";
        globalVariables.numberOfCalls = 0;
        globalVariables.numberOfRaises = 0;
    }

    public void check() {
        if (globalVariables.smallBlind.equals("player") && globalVariables.cardState.equals("preflop")) {
            globalVariables.playState = "";
            globalVariables.computerAction = "";
        } else {
            globalVariables.playState = "check";
            globalVariables.computerAction = "check";
        }
    }

    public void raise(double probwin) {
        double amount = (Math.round((probwin * computer.playerMoney) / 10.0) * 10) / 10;
        if (amount > player.playerMoney || amount > computer.playerMoney) {
            if (player.playerMoney > computer.playerMoney) {
                amount = player.playerMoney - globalVariables.betAmount;
            } else {
                amount = computer.playerMoney - globalVariables.betAmount;
            }
        }
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
