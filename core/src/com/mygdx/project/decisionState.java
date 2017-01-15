package com.mygdx.project;


/**
 * Created by ksbay on 1/5/2017.
 */
public class decisionState {

    double probWinPreFlop;
    double probWinFlop;
    double probWinTurn;
    double probWinRiver;

    double handValue;
    Player computer;

    getProbAndSave probAndSave;

    public void getDecision(double handValue, Player computer) {

        this.handValue = handValue;
        this.computer = computer;

        probAndSave = new getProbAndSave();

        probWinPreFlop = probAndSave.getWinProb(handValue, "preflop");
        probWinFlop = probAndSave.getWinProb(handValue, "flop");
        probWinTurn = probAndSave.getWinProb(handValue, "turn");
        probWinRiver = probAndSave.getWinProb(handValue, "river");


        //Computer goes second
        //need to implement blinds and allowing computer to make first action
        if (globalVariables.smallBlind.equals("computer")) {
            switch (globalVariables.cardState) {
                case "preflop":
                    switch (globalVariables.playState) {
                        case "raise":
                            if (probWinPreFlop > 0.5)
                                if (globalVariables.betAmount > 100 && globalVariables.betAmount < 400) {
                                    call();
                                    globalVariables.cardState = "flop";
                                } else if (globalVariables.betAmount >= 400)
                                    fold();
                                else
                                    raise(100);
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
                            }
                            if (probWinPreFlop > .5)
                                raise(100);
                            //player turn again
                            break;
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
                                    raise(100);
                            }
                            //call
                            if (probWinFlop >= .5) {
                                call();
                                globalVariables.cardState = "turn";
                            }
                            //fold
                            if (probWinFlop < .5) {
                                fold();
                                globalVariables.cardState = "turn";
                            }
                            break;
                        case ("check"):
                            //raise
                            if (probWinFlop >= .5) {
                                raise(100);
                            }
                            //check
                            if (probWinFlop < .5) {
                                check();
                                globalVariables.cardState = "turn";
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
                                    raise(100);
                            }
                            //call
                            if (probWinFlop >= .5) {
                                call();
                                globalVariables.cardState = "river";
                            }
                            //fold
                            if (probWinFlop < .5) {
                                fold();
                                globalVariables.cardState = "river";
                            }
                            break;
                        case ("check"):
                            //raise
                            if (probWinFlop >= .5) {
                                raise(100);
                            }
                            //check
                            if (probWinFlop < .5) {
                                check();
                                globalVariables.cardState = "river";
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
                                    raise(100);
                            }
                            //call
                            if (probWinFlop >= .5) {
                                call();
                                globalVariables.cardState = "end";
                            }
                            //fold
                            if (probWinFlop < .5) {
                                fold();
                                globalVariables.cardState = "end";
                            }
                            break;
                        case ("check"):
                            //raise
                            if (probWinFlop >= .5) {
                                raise(100);
                            }
                            //check
                            if (probWinFlop < .5) {
                                check();
                                globalVariables.cardState = "end";
                            }
                            break;
                    }
                    break;
            }
        }

        //Computer goes first
        else {
            switch (globalVariables.playState) {
                case ("bet"): {

                }
                case ("check"): {

                }
                case ("call"): {

                }
            }
        }
    }

    public void call() {
        computer.playerMoney -= globalVariables.betAmount;
        globalVariables.potValue += globalVariables.betAmount;
        globalVariables.playState = "call";
        globalVariables.computerAction = "call";
    }

    public void fold() {
        //computer.playerNumber -= globalVariables.betAmount;
        globalVariables.playState = "fold";
        globalVariables.computerAction = "fold";
    }

    public void check() {
        globalVariables.playState = "check";
        globalVariables.computerAction = "check";
    }

    public void raise(double amount) {
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
