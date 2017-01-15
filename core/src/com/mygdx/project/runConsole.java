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
    ArrayList<Card> computerPreFlop;
    ArrayList<Card> computerFlop;
    ArrayList<Card> computerTurn;
    ArrayList<Card> computerRiver;

    getProbAndSave probAndSave = new getProbAndSave();


    static winTest trywin;
    static winTest trywin2;
    static Player P1;
    static Player P2;
    int i = 1;


    public static void main(String[] args) {
        int totaldeals = 0;
        int hand = 0;
        runConsole testing = new runConsole();
//        testing.probAndSave.getProblist("serializedWinGivenStatePreFlop");
//        testing.probAndSave.getProblist("serializedWinGivenStateFlop");
//        testing.probAndSave.getProblist("serializedWinGivenStateTurn");
//        testing.probAndSave.getProblist("serializedWinGivenStateRiver");
        for (int hands = 0; hands < 1000; hands++) {
            //while (true) {
            //hand++;

            testing = new runConsole();

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
            testing.computerPreFlop = new ArrayList<>();
            testing.computerPreFlop.addAll(P2.hand);
            winTest trywinPreFlop = new winTest(testing.playerPreFlop);
            winTest trywinPreFlop2 = new winTest(testing.computerPreFlop);
            trywinPreFlop.handCheck();
            trywinPreFlop2.handCheck();

            testing.probAndSave.populateProbList(testing.playerPreFlop, trywinPreFlop2.player.handValue, trywinPreFlop, trywinPreFlop2, testing.table);

            testing.flop();

            testing.playerFlop = new ArrayList<>(P1.hand);
            testing.playerFlop.addAll(testing.table);
            testing.computerFlop = new ArrayList<>(P2.hand);
            testing.computerFlop.addAll(testing.table);
            winTest trywinFlop = new winTest(testing.playerFlop);
            winTest trywinFlop2 = new winTest(testing.computerFlop);
            trywinFlop.handCheck();
            trywinFlop2.handCheck();

            testing.probAndSave.populateProbList(testing.playerFlop, trywinFlop2.player.handValue, trywinFlop, trywinFlop2, testing.table);

            testing.turnRiver();

            testing.playerTurn = new ArrayList<>(P1.hand);
            testing.playerTurn.addAll(testing.table);
            testing.computerTurn = new ArrayList<>(P2.hand);
            testing.computerTurn.addAll(testing.table);
            winTest trywinTurn = new winTest(testing.playerTurn);
            winTest trywinTurn2 = new winTest(testing.computerTurn);
            trywinTurn.handCheck();
            trywinTurn2.handCheck();

            testing.probAndSave.populateProbList(testing.playerTurn, trywinTurn2.player.handValue, trywinTurn, trywinTurn2, testing.table);

            testing.turnRiver();

            testing.playerRiver = new ArrayList<>(P1.hand);
            testing.playerRiver.addAll(testing.table);
            testing.computerRiver = new ArrayList<>(P2.hand);
            testing.computerRiver.addAll(testing.table);
            winTest trywinRiver = new winTest(testing.playerRiver);
            winTest trywinRiver2 = new winTest(testing.computerRiver);
            trywinRiver.handCheck();
            trywinRiver2.handCheck();


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


            testing.probAndSave.populateProbList(testing.playerRiver, trywinRiver2.player.handValue, trywinRiver, trywinRiver2, testing.table);

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


//        testing.probAndSave.saveProblist(globalVariables.winGivenStatePreFlop, "serializedWinGivenStatePreFlop");
//        testing.probAndSave.saveProblist(globalVariables.winGivenStateFlop, "serializedWinGivenStateFlop");
//        testing.probAndSave.saveProblist(globalVariables.winGivenStateTurn, "serializedWinGivenStateTurn");
//        testing.probAndSave.saveProblist(globalVariables.winGivenStateRiver, "serializedWinGivenStateRiver");

        System.out.println("\n"+"winGivenStatePreFlop" + globalVariables.winGivenStatePreFlop);
        System.out.println("winGivenStateFlop" + globalVariables.winGivenStateFlop);
        System.out.println("winGivenStateTurn" + globalVariables.winGivenStateTurn);
        System.out.println("winGivenStateRiver" + globalVariables.winGivenStateRiver);


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


}
