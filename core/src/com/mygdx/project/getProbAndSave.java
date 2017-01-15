package com.mygdx.project;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ksbay on 1/5/2017.
 */
public class getProbAndSave {

    double preFlopValue = 0;
    double flopValue = 0;
    double turnValue = 0;
    double riverValue = 0;

    winTest trywin;
    winTest trywin2;
    ArrayList<Card> table;


    public String whoWins() {
        if (table.size() == 5) {
            if (trywin.player.handValue > trywin2.player.handValue) {
                return "player";
            }
            if (trywin.player.handValue < trywin2.player.handValue) {
                return "computer";
            }
            if (trywin.player.handValue == trywin2.player.handValue) {
                for (int i = 0; i < trywin.kickers.size(); i++) {
                    if (trywin.kickers.size() > i && trywin2.kickers.size() > i) {
                        if (trywin.kickers.get(i) > trywin2.kickers.get(i)) {
                            return "player";
                        }
                        if (trywin.kickers.get(i) < trywin2.kickers.get(i)) {
                            return "computer";
                        }
                    }
                }
                return "tie";
            }
        }
        return null;
    }

    public void saveProblist(HashMap<Double, Vector2> problist, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/" + fileName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(problist);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public HashMap<Double, Vector2> getProblist(String fileName) {

        try {
            FileInputStream fileIn = new FileInputStream("probabilities/" + fileName + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            switch (fileName) {
                case "serializedWinGivenStatePreFlop":
                    globalVariables.winGivenStatePreFlop = (HashMap<Double, Vector2>) in.readObject();
                    break;
                case "serializedWinGivenStateFlop":
                    globalVariables.winGivenStateFlop = (HashMap<Double, Vector2>) in.readObject();
                    break;
                case "serializedWinGivenStateTurn":
                    globalVariables.winGivenStateTurn = (HashMap<Double, Vector2>) in.readObject();
                    break;
                case "serializedWinGivenStateRiver":
                    globalVariables.winGivenStateRiver = (HashMap<Double, Vector2>) in.readObject();
                    break;
            }
            in.close();
            switch (fileName) {
                case "serializedWinGivenStatePreFlop":
                    return globalVariables.winGivenStatePreFlop;
                case "serializedWinGivenStateFlop":
                    return globalVariables.winGivenStateFlop;
                case "serializedWinGivenStateTurn":
                    return globalVariables.winGivenStateTurn;
                case "serializedWinGivenStateRiver":
                    return globalVariables.winGivenStateRiver;
            }
            return null;
        } catch (IOException i) {
            //Throws EOFException, removed stacktrace because of annoyance
            //i.printStackTrace();
            //Gdx.app.error("IOException","Caught");
            return null;
        } catch (ClassNotFoundException c) {
            Gdx.app.error("Class not found", "" + globalVariables.winGivenStatePreFlop.getClass());
            c.printStackTrace();
            return null;
        }
    }

    public void populateProbList(ArrayList<Card> state, double handValue, winTest trywin, winTest trywin2, ArrayList<Card> table) {

        this.trywin = trywin;
        this.trywin2 = trywin2;
        this.table = table;

        if (state.size() == 2) {
            preFlopValue = handValue;
        } else if (state.size() == 5) {
            flopValue = handValue;
        } else if (state.size() == 6) {
            turnValue = handValue;
        } else if (state.size() == 7) {
            riverValue = handValue;

            if (whoWins().equals("computer")) {
                updateProbWinGivenState(1, preFlopValue, "preflop");
                updateProbWinGivenState(1, flopValue, "flop");
                updateProbWinGivenState(1, turnValue, "turn");
                updateProbWinGivenState(1, riverValue, "river");
            } else {
                updateProbWinGivenState(0, preFlopValue, "preflop");
                updateProbWinGivenState(0, flopValue, "flop");
                updateProbWinGivenState(0, turnValue, "turn");
                updateProbWinGivenState(0, riverValue, "river");
            }
        }


    }

    public void updateProbWinGivenState(int winLose, double handValue, String handState) {

        switch (handState) {
            case "preflop":
                if (globalVariables.winGivenStatePreFlop.containsKey(handValue)) {
                    Vector2 updateProb = globalVariables.winGivenStatePreFlop.get(handValue);


                    updateProb.x += winLose;
                    updateProb.y++;

                    globalVariables.winGivenStatePreFlop.put(handValue, updateProb);
                } else {
                    globalVariables.winGivenStatePreFlop.put(handValue, new Vector2(winLose, 1));
                }
                break;
            case "flop":
                if (globalVariables.winGivenStateFlop.containsKey(handValue)) {
                    Vector2 updateProb = globalVariables.winGivenStateFlop.get(handValue);


                    updateProb.x += winLose;
                    updateProb.y++;

                    globalVariables.winGivenStateFlop.put(handValue, updateProb);
                } else {
                    globalVariables.winGivenStateFlop.put(handValue, new Vector2(winLose, 1));
                }
                break;
            case "turn":
                if (globalVariables.winGivenStateTurn.containsKey(handValue)) {
                    Vector2 updateProb = globalVariables.winGivenStateTurn.get(handValue);


                    updateProb.x += winLose;
                    updateProb.y++;

                    globalVariables.winGivenStateTurn.put(handValue, updateProb);
                } else {
                    globalVariables.winGivenStateTurn.put(handValue, new Vector2(winLose, 1));
                }
                break;
            case "river":
                if (globalVariables.winGivenStateRiver.containsKey(handValue)) {
                    Vector2 updateProb = globalVariables.winGivenStateRiver.get(handValue);


                    updateProb.x += winLose;
                    updateProb.y++;

                    globalVariables.winGivenStateRiver.put(handValue, updateProb);
                } else {
                    globalVariables.winGivenStateRiver.put(handValue, new Vector2(winLose, 1));
                }
                break;
        }

    }

    public double getWinProb(double handValue, String handState) {
        Vector2 tempProb = new Vector2();
        switch (handState) {
            case ("preflop"): {
                if (globalVariables.winGivenStatePreFlop.containsKey(handValue))
                    tempProb = globalVariables.winGivenStatePreFlop.get(handValue);
                return tempProb.y==0?0:tempProb.x/tempProb.y;
            }
            case ("flop"): {
                if (globalVariables.winGivenStateFlop.containsKey(handValue))
                    tempProb = globalVariables.winGivenStateFlop.get(handValue);
                return tempProb.y==0?0:tempProb.x/tempProb.y;
            }
            case ("turn"): {
                if (globalVariables.winGivenStateTurn.containsKey(handValue))
                    tempProb = globalVariables.winGivenStateTurn.get(handValue);
                return tempProb.y==0?0:tempProb.x/tempProb.y;
            }
            case ("river"): {
                if (globalVariables.winGivenStateRiver.containsKey(handValue))
                    tempProb = globalVariables.winGivenStateRiver.get(handValue);
                return tempProb.y==0?0:tempProb.x/tempProb.y;
            }
        }
        return -1;
    }

    public void updateProbActionGivenState(String action, double handValue) {

        if (!globalVariables.actionGivenState.containsKey(handValue)) {
            globalVariables.actionGivenState.put(handValue, new HashMap<String, Integer>() {{
                put("fold", 0);
                put("check", 0);
                put("call", 0);
                put("raise", 0);
            }});
        }

        int updateProbFold = (Integer) ((HashMap) globalVariables.actionGivenState.get(handValue)).get("fold");
        int updateProbCheck = (Integer) ((HashMap) globalVariables.actionGivenState.get(handValue)).get("check");
        int updateProbCall = (Integer) ((HashMap) globalVariables.actionGivenState.get(handValue)).get("call");
        int updateProbRaise = (Integer) ((HashMap) globalVariables.actionGivenState.get(handValue)).get("raise");

        switch (action) {
            case ("fold"): {
                globalVariables.actionGivenState.put(handValue, new HashMap<String, Integer>() {{
                    put("fold", updateProbFold + 1);
                    put("check", updateProbCheck);
                    put("call", updateProbCall);
                    put("raise", updateProbRaise);
                }});
            }
            case ("check"): {
                globalVariables.actionGivenState.put(handValue, new HashMap<String, Integer>() {{
                    put("fold", updateProbCheck);
                    put("check", updateProbCheck + 1);
                    put("call", updateProbCheck);
                    put("raise", updateProbCheck);
                }});
            }
            case ("call"): {
                globalVariables.actionGivenState.put(handValue, new HashMap<String, Integer>() {{
                    put("fold", updateProbCall);
                    put("check", updateProbCall);
                    put("call", updateProbCall + 1);
                    put("raise", updateProbCall);
                }});
            }
            case ("raise"): {
                globalVariables.actionGivenState.put(handValue, new HashMap<String, Integer>() {{
                    put("fold", updateProbRaise);
                    put("check", updateProbRaise);
                    put("call", updateProbRaise);
                    put("raise", updateProbRaise + 1);
                }});
            }
        }
    }

    public void updateProbAction(String action) {
        globalVariables.actionsPerformed++;
        if (!globalVariables.probAction.containsKey(action)) {
            globalVariables.probAction.put(action, 0);
        } else {
            globalVariables.probAction.put(action, globalVariables.probAction.get(action) + 1);
        }

    }

    public void updateProbState(Double handValue) {

        if (!globalVariables.probState.containsKey(handValue)) {
            globalVariables.probState.put(handValue, 0);
        } else {
            globalVariables.probState.put(handValue, globalVariables.probState.get(handValue) + 1);
        }
    }

    public float bayesRule(ArrayList<Card> state, String action) {
        ArrayList<Card> sorted = sortState(state);
        float probAction = globalVariables.probAction.get(action) / globalVariables.actionsPerformed;
        float probState = globalVariables.probState.get(sorted) / globalVariables.statesDealt;
        float probActionGivenState = globalVariables.actionGivenState.get(sorted).get(action) / globalVariables.statesDealt;
        return (probActionGivenState * probState) / probAction;
    }

    public double getExpectedValue(double prob) {
        return prob * globalVariables.potValue - (1 - prob) * globalVariables.betAmount;
    }

    public ArrayList<Card> sortState(ArrayList<Card> state) {
        return sortByValue(state);
    }

    public ArrayList<Card> sortByValue(ArrayList<Card> state) {
        ArrayList<Card> sortedHand = new ArrayList<>();
        while (state.size() > 0) {
            int pos = 0;
            Card c = state.get(0);
            for (int i = 1; i < state.size(); i++) {
                Card c1 = state.get(i);
                if (runConsole.toValue.valueOf(c1.value).getValue() < runConsole.toValue.valueOf(c.value).getValue() ||
                        (c1.value.equals(c.value) && c1.getSuit() < c.getSuit())) {
                    pos = i;
                    c = c1;
                }
            }
            state.remove(pos);
            sortedHand.add(c);
        }
        return sortedHand;
    }
}
