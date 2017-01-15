package com.mygdx.project;

import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ksbay on 11/25/2016.
 */
public class globalVariables {
    static double potValue = 0;
    static double betAmount = 0;
    static double blindAmount=50;
    static String playState = "";
    static String cardState = "preflop";
    static String playerAction="";
    static String computerAction="";
    static String smallBlind="computer";
    static String whosTurn="";
    //static HashMap<Double, Vector2> winGivenState = new HashMap<>();
    static HashMap<Double, Vector2> winGivenStatePreFlop = new HashMap<>();
    static HashMap<Double, Vector2> winGivenStateFlop = new HashMap<>();
    static HashMap<Double, Vector2> winGivenStateTurn = new HashMap<>();
    static HashMap<Double, Vector2> winGivenStateRiver = new HashMap<>();
    static HashMap<Double, HashMap<String, Integer>> actionGivenState = new HashMap<>();
    static HashMap<String, Integer> probAction = new HashMap<>();
    static HashMap<Double, Integer> probState = new HashMap<>();
    static int statesDealt = 0;
    static int actionsPerformed = 0;

    static void setBetAmount(double bet) {
        betAmount = bet;
    }

    static double getBetAmount() {
        return betAmount;
    }


}
