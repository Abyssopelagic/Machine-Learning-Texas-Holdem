package com.mygdx.project;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

import java.io.*;
import java.util.*;

/**
 * Created by ksbay on 9/30/2016.
 */
public class runConsole {

    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> table = new ArrayList<>();
    ArrayList<Card> playerPreFlop;
    ArrayList<Card> playerFlop;
    ArrayList<Card> playerTurn;
    ArrayList<Card> playerRiver;

    ArrayList<Card> preFlopState = new ArrayList<>();
    ArrayList<Card> flopState = new ArrayList<>();
    ArrayList<Card> turnState = new ArrayList<>();
    ArrayList<Card> riverState = new ArrayList<>();


    static winTest trywin;
    static winTest trywin2;
    static Player P1;
    static Player P2;
    int i = 1;


    public static void main(String[] args) {
        int totaldeals = 0;
        int hand = 0;
        for (int hands = 0; hands < 10000; hands++) {
            //while (true) {
            //hand++;
            runConsole testing = new runConsole();
            testing.createDeck();
            testing.createPlayers();
            testing.shuffleDeck();
            testing.dealPlayers();
//            testing.printCards(P1.hand);
//            System.out.println();
//            testing.printCards(P2.hand);
//            System.out.println();

            testing.playerPreFlop = new ArrayList<>();
            testing.playerPreFlop.addAll(P1.hand);
            testing.populateProbList(testing.playerPreFlop);

            testing.flop();

            testing.playerFlop = new ArrayList<>(P1.hand);
            testing.playerFlop.addAll(testing.table);
            testing.populateProbList(testing.playerFlop);

            testing.turnRiver();

            testing.playerTurn = new ArrayList<>(P1.hand);
            testing.playerTurn.addAll(testing.table);
            testing.populateProbList(testing.playerTurn);

            testing.turnRiver();

            testing.playerRiver = new ArrayList<>(P1.hand);
            testing.playerRiver.addAll(testing.table);


//            testing.printCards(testing.table);
//            System.out.println();
            //print deck
            //testing.printCards(testing.deck);


            //table plus P1 hand
            ArrayList<Card> playerOneplusTable = new ArrayList<Card>();
            playerOneplusTable.addAll(P1.hand);
            playerOneplusTable.addAll(testing.table);
            trywin = new winTest(playerOneplusTable);
            trywin.handCheck();

            //table plus P2 hand
            ArrayList<Card> playerTwoplutTable = new ArrayList<Card>();
            playerTwoplutTable.addAll(P2.hand);
            playerTwoplutTable.addAll(testing.table);
            trywin2 = new winTest(playerTwoplutTable);
            trywin2.handCheck();


            testing.populateProbList(testing.playerRiver);


//player 1 and 2
            //list amount of each card
//            for (int j = 2, i = 2; j < trywin.amountOfCard.length; j++, i++) {
//                System.out.println(i + ": " + trywin.amountOfCard[j] + "\t\t" + trywin2.amountOfCard[j]);
//            }
//            System.out.println();
//            //list amount of each suit
//            for (int i = 0; i < trywin.amountOfSuit.length; i++) {
//                System.out.println(i + ": " + trywin.amountOfSuit[i] + "\t\t" + trywin2.amountOfSuit[i]);
//            }
/////////////////
//            System.out.println();
//            System.out.println("Player 1");
//            System.out.println("Straight: " + trywin.straight);
//            System.out.println("Flush: " + trywin.flush);
//            System.out.println();
//            System.out.println();
//            System.out.println("Player 2");
//            System.out.println("Straight: " + trywin2.straight);
//            System.out.println("Flush: " + trywin2.flush);
//            System.out.println();
//            System.out.println(testing.whoWins());
//            System.out.println();
//
//            System.out.println("Hand number: " + hand);


            //run till hand is drawn
//            if (trywin.flush) {
//                break;
//           }
        }
        //totaldeals += hand;
        System.out.println("Total hands dealt: " + totaldeals);
        System.out.println();
        System.out.println("Player");
        System.out.println(trywin.set);
        System.out.println("High card: " + trywin.highCard);
        System.out.println("Hand Value " + trywin.player.handValue);
        System.out.println();
        System.out.println("Computer");
        System.out.println(trywin2.set);
        System.out.println("High card: " + trywin2.highCard);
        System.out.println("Hand Value " + trywin2.player.handValue);


        System.out.println();

        System.out.println();

    }

    public enum toValue {
        two(2), three(3), four(4), five(5),
        six(6), seven(7), eight(8), nine(9), ten(10),
        jack(11), queen(12), king(13), ace(14),
        hearts(20), diamonds(30), spades(40), clubs(50);
        private int value;

        toValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public void createPlayers() {
        P1 = new Player(1);
        P2 = new Player(2);
    }

    public void createDeck() {
        deck.add(new Card("spades", "two"));
        deck.add(new Card("diamonds", "two"));
        deck.add(new Card("clubs", "two"));
        deck.add(new Card("hearts", "two"));
        deck.add(new Card("spades", "three"));
        deck.add(new Card("diamonds", "three"));
        deck.add(new Card("clubs", "three"));
        deck.add(new Card("hearts", "three"));
        deck.add(new Card("spades", "four"));
        deck.add(new Card("diamonds", "four"));
        deck.add(new Card("clubs", "four"));
        deck.add(new Card("hearts", "four"));
        deck.add(new Card("spades", "five"));
        deck.add(new Card("diamonds", "five"));
        deck.add(new Card("clubs", "five"));
        deck.add(new Card("hearts", "five"));
        deck.add(new Card("spades", "six"));
        deck.add(new Card("diamonds", "six"));
        deck.add(new Card("clubs", "six"));
        deck.add(new Card("hearts", "six"));
        deck.add(new Card("spades", "seven"));
        deck.add(new Card("diamonds", "seven"));
        deck.add(new Card("clubs", "seven"));
        deck.add(new Card("hearts", "seven"));
        deck.add(new Card("spades", "eight"));
        deck.add(new Card("diamonds", "eight"));
        deck.add(new Card("clubs", "eight"));
        deck.add(new Card("hearts", "eight"));
        deck.add(new Card("spades", "nine"));
        deck.add(new Card("diamonds", "nine"));
        deck.add(new Card("clubs", "nine"));
        deck.add(new Card("hearts", "nine"));
        deck.add(new Card("spades", "ten"));
        deck.add(new Card("diamonds", "ten"));
        deck.add(new Card("clubs", "ten"));
        deck.add(new Card("hearts", "ten"));
        deck.add(new Card("spades", "jack"));
        deck.add(new Card("diamonds", "jack"));
        deck.add(new Card("clubs", "jack"));
        deck.add(new Card("hearts", "jack"));
        deck.add(new Card("spades", "queen"));
        deck.add(new Card("diamonds", "queen"));
        deck.add(new Card("clubs", "queen"));
        deck.add(new Card("hearts", "queen"));
        deck.add(new Card("spades", "king"));
        deck.add(new Card("diamonds", "king"));
        deck.add(new Card("clubs", "king"));
        deck.add(new Card("hearts", "king"));
        deck.add(new Card("spades", "ace"));
        deck.add(new Card("diamonds", "ace"));
        deck.add(new Card("clubs", "ace"));
        deck.add(new Card("hearts", "ace"));
    }

    public void dealPlayers() {
        P1.hand.add(deck.get(0));
        //playerOneHand.add(deck.get(0));
        deck.remove(0);

        P2.hand.add(deck.get(0));
        //playerTwoHand.add(deck.get(0));
        deck.remove(0);

        P1.hand.add(deck.get(0));
        //playerOneHand.add(deck.get(0));
        deck.remove(0);

        P2.hand.add(deck.get(0));
        //playerTwoHand.add(deck.get(0));
        deck.remove(0);
    }

    public void dealTable() {
        //burn 1
        deck.remove(0);

        //flop
        table.add(deck.get(0));
        deck.remove(0);
        table.add(deck.get(0));
        deck.remove(0);
        table.add(deck.get(0));
        deck.remove(0);

        //burn 1
        deck.remove(0);

        //turn
        table.add(deck.get(0));
        deck.remove(0);

        //burn 1
        deck.remove(0);

        //river
        table.add(deck.get(0));
        deck.remove(0);
    }

    public void flop() {
        //burn
        deck.remove(0);

        //flop
        table.add(deck.get(0));
        deck.remove(0);
        table.add(deck.get(0));
        deck.remove(0);
        table.add(deck.get(0));
        deck.remove(0);
    }

    public void turnRiver() {
        //burn 1
        deck.remove(0);

        //turn
        table.add(deck.get(0));
        deck.remove(0);
    }

    public void printCards(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.println(i++ + ": " + card.value + " of " + card.suit + ": " + toValue.valueOf(card.value).getValue());
        }
    }

    public void shuffleDeck() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
        seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public winTest getPlayer(Player player) {
        ArrayList<Card> playerOneplusTable = new ArrayList<Card>();
        playerOneplusTable.addAll(player.hand);
        playerOneplusTable.addAll(table);
        winTest trywin = new winTest(playerOneplusTable);
        trywin.handCheck();
        return trywin;
    }

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

    public void saveProblist(HashMap<Object, Vector2> problst) {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/serializedProbMap.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(problst);
            out.close();
            fileOut.close();
            //Gdx.app.log("Serialized", "Data");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public HashMap<ArrayList<Card>, Vector2> getProblist() {
        try {
            FileInputStream fileIn = new FileInputStream("probabilities/serializedProbMap.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            globalVariables.winGivenState = (HashMap<ArrayList<Card>, Vector2>) in.readObject();
            in.close();
            return globalVariables.winGivenState;
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            Gdx.app.error("Class not found", "" + globalVariables.winGivenState.getClass());
            c.printStackTrace();
            return null;
        }
    }

    public void populateProbList(ArrayList<Card> state) {


        if (state.size() == 2) {
            preFlopState = state;
        }
        if (state.size() == 5) {
            flopState = state;
        }
        if (state.size() == 6) {
            turnState = state;
        }
        if (state.size() == 7) {
            riverState = state;

            if (whoWins().equals("player")) {
                updateProbability(1, preFlopState);
                updateProbability(1, flopState);
                updateProbability(1, turnState);
                updateProbability(1, riverState);
            }
            if (whoWins().equals("computer")) {
                updateProbability(0, preFlopState);
                updateProbability(0, flopState);
                updateProbability(0, turnState);
                updateProbability(0, riverState);
            }
        }


    }

    public void updateProbability(int winLose, ArrayList<Card> state) {
        ArrayList<Card> sorted = sortState(state);
        if (globalVariables.winGivenState.containsKey(sorted)) {
            Vector2 updateProb = globalVariables.winGivenState.get(sorted);

            updateProb.x += winLose;
            updateProb.y++;

            globalVariables.winGivenState.put(sorted, updateProb);
        } else {
            globalVariables.winGivenState.put(sorted, new Vector2(winLose, 1));
            //System.out.println();
        }
    }

    public float getProbablity(ArrayList<Card> state) {
        ArrayList<Card> sorted = sortState(state);
        Vector2 tempProb = globalVariables.winGivenState.get(sorted);
        return tempProb.x / tempProb.y;
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
