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
    static String gameState = "";
    static String playerAction;
    static HashMap<ArrayList<Card>, Vector2> winGivenState = new HashMap<>();
    static HashMap<ArrayList<Card>, HashMap<String, Vector2>> actionGivenState = new HashMap<>();
    static HashMap<String, Vector2> probAction = new HashMap<>();
    static HashMap<ArrayList<Card>, Vector2> probState = new HashMap<>();

    static void setBetAmount(double bet) {
        betAmount = bet;
    }

    static double getBetAmount() {
        return betAmount;
    }


}
