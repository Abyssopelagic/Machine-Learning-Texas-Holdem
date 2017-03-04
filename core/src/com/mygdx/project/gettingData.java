package com.mygdx.project;

import com.badlogic.gdx.Gdx;

import java.io.*;
import java.util.*;

/**
 * Created by Keenan Baynard on 2/14/2017.
 */
public class gettingData {

//    ArrayList<ArrayList<Card>> playerCards = new ArrayList<>();
//    ArrayList<ArrayList<Card>> tableCards = new ArrayList<>();

    public void getCards() {
        String face1 = "";
        String suit1 = "";
        String face2 = "";
        String suit2 = "";
        for (String hand : globalVariables.playerCards) {


            String face1Letter = String.valueOf(hand.charAt(0));
            String suit1Letter = String.valueOf(hand.charAt(1));

            String face2Letter = String.valueOf(hand.charAt(3));
            String suit2Letter = String.valueOf(hand.charAt(4));

            switch (face1Letter) {
                case "2":
                    face1 = "two";
                    break;
                case "3":
                    face1 = "three";
                    break;
                case "4":
                    face1 = "four";
                    break;
                case "5":
                    face1 = "five";
                    break;
                case "6":
                    face1 = "six";
                    break;
                case "7":
                    face1 = "seven";
                    break;
                case "8":
                    face1 = "eight";
                    break;
                case "9":
                    face1 = "nine";
                    break;
                case "T":
                    face1 = "ten";
                    break;
                case "J":
                    face1 = "jack";
                    break;
                case "Q":
                    face1 = "queen";
                    break;
                case "K":
                    face1 = "king";
                    break;
                case "A":
                    face1 = "ace";
            }

            switch (suit1Letter) {
                case "c":
                    suit1 = "clubs";
                    break;
                case "d":
                    suit1 = "diamonds";
                    break;
                case "h":
                    suit1 = "hearts";
                    break;
                case "s":
                    suit1 = "spades";
            }

            switch (face2Letter) {
                case "2":
                    face2 = "two";
                    break;
                case "3":
                    face2 = "three";
                    break;
                case "4":
                    face2 = "four";
                    break;
                case "5":
                    face2 = "five";
                    break;
                case "6":
                    face2 = "six";
                    break;
                case "7":
                    face2 = "seven";
                    break;
                case "8":
                    face2 = "eight";
                    break;
                case "9":
                    face2 = "nine";
                    break;
                case "T":
                    face2 = "ten";
                    break;
                case "J":
                    face2 = "jack";
                    break;
                case "Q":
                    face2 = "queen";
                    break;
                case "K":
                    face2 = "king";
                    break;
                case "A":
                    face2 = "ace";
            }

            switch (suit2Letter) {
                case "c":
                    suit2 = "clubs";
                    break;
                case "d":
                    suit2 = "diamonds";
                    break;
                case "h":
                    suit2 = "hearts";
                    break;
                case "s":
                    suit2 = "spades";
            }
            Card card1 = new Card(suit1, face1);
            Card card2 = new Card(suit2, face2);

            globalVariables.playerCardsList.add(new ArrayList<Card>() {{
                add(card1);
                add(card2);
            }});

        }
    }

    public void getTable() {
        String face1 = "";
        String suit1 = "";
        String face2 = "";
        String suit2 = "";
        String face3 = "";
        String suit3 = "";
        String face4 = "";
        String suit4 = "";
        String face5 = "";
        String suit5 = "";
        String face1Letter = "";
        String suit1Letter = "";
        String face2Letter = "";
        String suit2Letter = "";
        String face3Letter = "";
        String suit3Letter = "";
        String face4Letter = "";
        String suit4Letter = "";
        String face5Letter = "";
        String suit5Letter = "";
        for (String hand : globalVariables.tableCards) {

            if (hand.length() == 8) {
                face1Letter = String.valueOf(hand.charAt(0));
                suit1Letter = String.valueOf(hand.charAt(1));

                face2Letter = String.valueOf(hand.charAt(3));
                suit2Letter = String.valueOf(hand.charAt(4));

                face3Letter = String.valueOf(hand.charAt(6));
                suit3Letter = String.valueOf(hand.charAt(7));
            }
            if (hand.length() == 11) {
                face1Letter = String.valueOf(hand.charAt(0));
                suit1Letter = String.valueOf(hand.charAt(1));

                face2Letter = String.valueOf(hand.charAt(3));
                suit2Letter = String.valueOf(hand.charAt(4));

                face3Letter = String.valueOf(hand.charAt(6));
                suit3Letter = String.valueOf(hand.charAt(7));

                face4Letter = String.valueOf(hand.charAt(9));
                suit4Letter = String.valueOf(hand.charAt(10));
            }
            if (hand.length() == 14) {
                face1Letter = String.valueOf(hand.charAt(0));
                suit1Letter = String.valueOf(hand.charAt(1));

                face2Letter = String.valueOf(hand.charAt(3));
                suit2Letter = String.valueOf(hand.charAt(4));

                face3Letter = String.valueOf(hand.charAt(6));
                suit3Letter = String.valueOf(hand.charAt(7));

                face4Letter = String.valueOf(hand.charAt(9));
                suit4Letter = String.valueOf(hand.charAt(10));

                face5Letter = String.valueOf(hand.charAt(12));
                suit5Letter = String.valueOf(hand.charAt(13));
            }


            switch (face1Letter) {
                case "2":
                    face1 = "two";
                    break;
                case "3":
                    face1 = "three";
                    break;
                case "4":
                    face1 = "four";
                    break;
                case "5":
                    face1 = "five";
                    break;
                case "6":
                    face1 = "six";
                    break;
                case "7":
                    face1 = "seven";
                    break;
                case "8":
                    face1 = "eight";
                    break;
                case "9":
                    face1 = "nine";
                    break;
                case "T":
                    face1 = "ten";
                    break;
                case "J":
                    face1 = "jack";
                    break;
                case "Q":
                    face1 = "queen";
                    break;
                case "K":
                    face1 = "king";
                    break;
                case "A":
                    face1 = "ace";
            }

            switch (suit1Letter) {
                case "c":
                    suit1 = "clubs";
                    break;
                case "d":
                    suit1 = "diamonds";
                    break;
                case "h":
                    suit1 = "hearts";
                    break;
                case "s":
                    suit1 = "spades";
            }

            switch (face2Letter) {
                case "2":
                    face2 = "two";
                    break;
                case "3":
                    face2 = "three";
                    break;
                case "4":
                    face2 = "four";
                    break;
                case "5":
                    face2 = "five";
                    break;
                case "6":
                    face2 = "six";
                    break;
                case "7":
                    face2 = "seven";
                    break;
                case "8":
                    face2 = "eight";
                    break;
                case "9":
                    face2 = "nine";
                    break;
                case "T":
                    face2 = "ten";
                    break;
                case "J":
                    face2 = "jack";
                    break;
                case "Q":
                    face2 = "queen";
                    break;
                case "K":
                    face2 = "king";
                    break;
                case "A":
                    face2 = "ace";
            }

            switch (suit2Letter) {
                case "c":
                    suit2 = "clubs";
                    break;
                case "d":
                    suit2 = "diamonds";
                    break;
                case "h":
                    suit2 = "hearts";
                    break;
                case "s":
                    suit2 = "spades";
            }

            switch (face3Letter) {
                case "2":
                    face3 = "two";
                    break;
                case "3":
                    face3 = "three";
                    break;
                case "4":
                    face3 = "four";
                    break;
                case "5":
                    face3 = "five";
                    break;
                case "6":
                    face3 = "six";
                    break;
                case "7":
                    face3 = "seven";
                    break;
                case "8":
                    face3 = "eight";
                    break;
                case "9":
                    face3 = "nine";
                    break;
                case "T":
                    face3 = "ten";
                    break;
                case "J":
                    face3 = "jack";
                    break;
                case "Q":
                    face3 = "queen";
                    break;
                case "K":
                    face3 = "king";
                    break;
                case "A":
                    face3 = "ace";
            }

            switch (suit3Letter) {
                case "c":
                    suit3 = "clubs";
                    break;
                case "d":
                    suit3 = "diamonds";
                    break;
                case "h":
                    suit3 = "hearts";
                    break;
                case "s":
                    suit3 = "spades";
            }

            switch (face4Letter) {
                case "2":
                    face4 = "two";
                    break;
                case "3":
                    face4 = "three";
                    break;
                case "4":
                    face4 = "four";
                    break;
                case "5":
                    face4 = "five";
                    break;
                case "6":
                    face4 = "six";
                    break;
                case "7":
                    face4 = "seven";
                    break;
                case "8":
                    face4 = "eight";
                    break;
                case "9":
                    face4 = "nine";
                    break;
                case "T":
                    face4 = "ten";
                    break;
                case "J":
                    face4 = "jack";
                    break;
                case "Q":
                    face4 = "queen";
                    break;
                case "K":
                    face4 = "king";
                    break;
                case "A":
                    face4 = "ace";
            }

            switch (suit4Letter) {
                case "c":
                    suit4 = "clubs";
                    break;
                case "d":
                    suit4 = "diamonds";
                    break;
                case "h":
                    suit4 = "hearts";
                    break;
                case "s":
                    suit4 = "spades";
            }

            switch (face5Letter) {
                case "2":
                    face5 = "two";
                    break;
                case "3":
                    face5 = "three";
                    break;
                case "4":
                    face5 = "four";
                    break;
                case "5":
                    face5 = "five";
                    break;
                case "6":
                    face5 = "six";
                    break;
                case "7":
                    face5 = "seven";
                    break;
                case "8":
                    face5 = "eight";
                    break;
                case "9":
                    face5 = "nine";
                    break;
                case "T":
                    face5 = "ten";
                    break;
                case "J":
                    face5 = "jack";
                    break;
                case "Q":
                    face5 = "queen";
                    break;
                case "K":
                    face5 = "king";
                    break;
                case "A":
                    face5 = "ace";
            }

            switch (suit5Letter) {
                case "c":
                    suit5 = "clubs";
                    break;
                case "d":
                    suit5 = "diamonds";
                    break;
                case "h":
                    suit5 = "hearts";
                    break;
                case "s":
                    suit5 = "spades";
            }
            Card card1 = new Card(suit1, face1);
            Card card2 = new Card(suit2, face2);
            Card card3 = new Card(suit3, face3);
            Card card4 = new Card(suit4, face4);
            Card card5 = new Card(suit5, face5);

            if (!face5Letter.equals("")) {
                globalVariables.tableCardsList.add(new ArrayList<Card>() {{
                    add(card1);
                    add(card2);
                    add(card3);
                    add(card4);
                    add(card5);
                }});
                continue;
            }
            if (!face4Letter.equals("")) {
                globalVariables.tableCardsList.add(new ArrayList<Card>() {{
                    add(card1);
                    add(card2);
                    add(card3);
                    add(card4);
                }});
                continue;
            }
            if (!face3Letter.equals("")) {
                globalVariables.tableCardsList.add(new ArrayList<Card>() {{
                    add(card1);
                    add(card2);
                    add(card3);
                }});
            }

        }
    }

    public ArrayList<String> getActions(String[] array) {
        ArrayList<String> tempArray = new ArrayList<>();
        String tempString;
        for (String action : array) {
            switch (String.valueOf(action.charAt(0))) {
                case "B":
                    tempString = "bet";
                    break;
                case "f":
                    tempString = "fold";
                    break;
                case "k":
                    tempString = "check";
                    break;
                case "b":
                    tempString = "bet";
                    break;
                case "c":
                    tempString = "call";
                    break;
                case "r":
                    tempString = "raise";
                    break;
                case "A":
                    tempString = "all-in";
                    break;
                case "-":
                    tempString = "no action";
                    break;
                default:
                    tempString = "Undeclared Variable";
            }
            tempArray.add(tempString);
        }
        return tempArray;
    }

    HashMap<Double, Double> handProbabilityMap = new HashMap<>();
    Double maxProb = 0.0;
    Double probMax;

    public HashMap<Double, Double> handStrengthGivenTableStrengthAndAction(Double tableStrength, String opponentAction, String gameState) {
        HashMap<Double, Double> probOfHand = new HashMap<>();

        ArrayList<Double> as = new ArrayList<>();
        int gameStateInt = 0;
        switch (gameState) {
            case "preflop":
                gameStateInt = 0;
                as = new ArrayList<>(globalVariables.probabilityOfHandPreFlop.keySet());
                break;
            case "flop":
                gameStateInt = 3;
                as = new ArrayList<>(globalVariables.probabilityOfHandFlop.keySet());
                break;
            case "turn":
                gameStateInt = 4;
                as = new ArrayList<>(globalVariables.probabilityOfHandTurn.keySet());
                break;
            case "river":
                gameStateInt = 5;
                as = new ArrayList<>(globalVariables.probabilityOfHandRiver.keySet());
        }
        Double sum = sumTableActionProb(tableStrength, opponentAction, gameStateInt);
        for (Double a : as) {
            probOfHand.put(a,
                    (tableActionProb(a, tableStrength, opponentAction, gameStateInt) / sum));
        }
        handProbabilityMap = probOfHand;
        return probOfHand;
    }

    public Double tableActionProb(Double hand, Double tableStrength, String opponentAction, Integer gameState) {
        //player cards
        //table cards
        double matching = 0;
        double total = 0;
        winTest handWinTest = new winTest(new ArrayList<>());
        winTest tableWinTest;
        ArrayList<String> turnActions = globalVariables.turnAction;
        for (int i = 0; i < globalVariables.playerCardsList.size(); i++) {
            ArrayList<Card> temp = new ArrayList<>();
            temp.addAll(globalVariables.playerCardsList.get(i));
            temp.addAll(globalVariables.tableCardsList.get(i).subList(0, gameState));
            handWinTest = new winTest(temp);
            handWinTest.handCheck();
            if (hand == handWinTest.player.handValue) {
                tableWinTest = new winTest(new ArrayList<>(globalVariables.tableCardsList.get(i).subList(0, gameState)));
                tableWinTest.handCheck();
                if (tableWinTest.player.handValue == tableStrength && opponentAction.equals(turnActions.get(i))) {
                    matching++;
                }
            }
            total++;
        }
        return ((matching / total) * getProbOfHandAtState(handWinTest.player.handValue, gameState));
    }

    public Double sumTableActionProb(Double tableStrength, String opponentAction, Integer gameState) {
        Double sum = 0.0;
        winTest handWinTest;
        winTest tableWinTest;
        ArrayList<Double> as = new ArrayList<>();
        switch (gameState) {
            case 0:
                as = new ArrayList<>(globalVariables.probabilityOfHandPreFlop.keySet());
                break;
            case 3:
                as = new ArrayList<>(globalVariables.probabilityOfHandFlop.keySet());
                break;
            case 4:
                as = new ArrayList<>(globalVariables.probabilityOfHandTurn.keySet());
                break;
            case 5:
                as = new ArrayList<>(globalVariables.probabilityOfHandRiver.keySet());
        }
        //winTest iWinTest = new winTest(new ArrayList<>());
        double matching = 0;
        double total = 0;
        for (Double a : as) {
            for (int j = 0; j < globalVariables.playerCardsList.size(); j++) {
                ArrayList<Card> temp = new ArrayList<>();
                //ArrayList<Card> temp2 = new ArrayList<>();
                temp.addAll(globalVariables.playerCardsList.get(j));
                temp.addAll(globalVariables.tableCardsList.get(j).subList(0, gameState));
                //temp2.addAll(globalVariables.playerCardsList.get(i));
                //temp2.addAll(globalVariables.tableCardsList.get(i).subList(0,gameState));
                handWinTest = new winTest(temp);
                //iWinTest = new winTest(temp2);
                //iWinTest.handCheck();
                handWinTest.handCheck();
                if (handWinTest.player.handValue == a) {
                    tableWinTest = new winTest(new ArrayList<>(globalVariables.tableCardsList.get(j).subList(0, gameState)));
                    tableWinTest.handCheck();
                    if (tableWinTest.player.handValue == tableStrength && opponentAction.equals(globalVariables.turnAction.get(j))) {
                        matching++;
                    }
                }
                total++;
            }
            sum += ((matching / total) * (getProbOfHandAtState(a, gameState)));
        }
        return sum;
    }

    public Double getProbOfHandAtState(Double handValue, Integer gameState) {
        double size = 0;
        HashMap<Double, Integer> temp = new HashMap<>();
        switch (gameState) {
            case 0:
                temp = globalVariables.probabilityOfHandPreFlop;
                break;
            case 3:
                temp = globalVariables.probabilityOfHandFlop;
                break;
            case 4:
                temp = globalVariables.probabilityOfHandTurn;
                break;
            case 5:
                temp = globalVariables.probabilityOfHandRiver;
        }
        for (Integer value : temp.values()) {
            size += value;
        }
        if (temp.get(handValue) == null) {
            Gdx.app.error("Value not found", "" + handValue);
        }
        return temp.get(handValue) / size;
    }


    public void saveActionsAndCards(ArrayList<String> var, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/" + fileName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(var);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void saveStrings(HashMap<String, Double> var, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/" + fileName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(var);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void saveMapCount(HashMap<Double, Double> var, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/" + fileName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(var);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void saveProblist(HashMap<Double, Integer> problist, String fileName) {
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

    public void saveActionsAndCards() {
        saveActionsAndCards(globalVariables.preFlopAction, "preFlopActions");
        saveActionsAndCards(globalVariables.flopAction, "flopActions");
        saveActionsAndCards(globalVariables.turnAction, "turnActions");
        saveActionsAndCards(globalVariables.riverAction, "riverActions");
        saveActionsAndCards(globalVariables.playerCards, "playerCards");
        saveActionsAndCards(globalVariables.tableCards, "tableCards");

    }

    public void saveStrings() {
        saveStrings(globalVariables.preFlopActionMapCount, "preFlopActionMapCount");
        saveStrings(globalVariables.flopActionMapCount, "flopActionMapCount");
        saveStrings(globalVariables.turnActionMapCount, "turnActionMapCount");
        saveStrings(globalVariables.riverActionMapCount, "riverActionMapCount");
    }

    public void saveMaps() {
        saveMapCount(globalVariables.preFlopStateMap, "preFlopStateMap");
        saveMapCount(globalVariables.flopStateMap, "flopStateMap");
        saveMapCount(globalVariables.turnStateMap, "turnStateMap");
        saveMapCount(globalVariables.riverStateMap, "riverStateMap");
    }

    public void getMaps(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream("probabilities/" + fileName + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            switch (fileName) {
                case "preFlopActionMapCount":
                    globalVariables.preFlopActionMapCount = (HashMap<String, Double>) in.readObject();
                    break;
                case "flopActionMapCount":
                    globalVariables.flopActionMapCount = (HashMap<String, Double>) in.readObject();
                    break;
                case "turnActionMapCount":
                    globalVariables.turnActionMapCount = (HashMap<String, Double>) in.readObject();
                    break;
                case "riverActionMapCount":
                    globalVariables.riverActionMapCount = (HashMap<String, Double>) in.readObject();
                    break;
                case "preFlopStateMap":
                    globalVariables.preFlopStateMap = (HashMap<Double, Double>) in.readObject();
                    break;
                case "flopStateMap":
                    globalVariables.flopStateMap = (HashMap<Double, Double>) in.readObject();
                    break;
                case "turnStateMap":
                    globalVariables.turnStateMap = (HashMap<Double, Double>) in.readObject();
                    break;
                case "riverStateMap":
                    globalVariables.riverStateMap = (HashMap<Double, Double>) in.readObject();
                    break;
                case "preFlopActions":
                    globalVariables.preFlopAction = (ArrayList<String>) in.readObject();
                    break;
                case "flopActions":
                    globalVariables.flopAction = (ArrayList<String>) in.readObject();
                    break;
                case "turnActions":
                    globalVariables.turnAction = (ArrayList<String>) in.readObject();
                    break;
                case "riverActions":
                    globalVariables.riverAction = (ArrayList<String>) in.readObject();
                    break;
                case "playerCards":
                    globalVariables.playerCards = (ArrayList<String>) in.readObject();
                    break;
                case "tableCards":
                    globalVariables.tableCards = (ArrayList<String>) in.readObject();
                    break;
//                case "probabilityOfHand":
//                    globalVariables.probabilityOfHand=(HashMap<Double,Integer>) in.readObject();
//                    break;
                case "probabilityOfHandPreFlop":
                    globalVariables.probabilityOfHandPreFlop = (HashMap<Double, Integer>) in.readObject();
                    break;
                case "probabilityOfHandFlop":
                    globalVariables.probabilityOfHandFlop = (HashMap<Double, Integer>) in.readObject();
                    break;
                case "probabilityOfHandTurn":
                    globalVariables.probabilityOfHandTurn = (HashMap<Double, Integer>) in.readObject();
                    break;
                case "probabilityOfHandRiver":
                    globalVariables.probabilityOfHandRiver = (HashMap<Double, Integer>) in.readObject();
            }
            in.close();
        } catch (IOException i) {

        } catch (ClassNotFoundException c) {
            Gdx.app.error("Class not found", "");
        }
    }


}
