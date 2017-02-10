package com.mygdx.project;

import java.util.ArrayList;

/**
 * Created by ksbay on 11/10/2016.
 */
public class Player {
    ArrayList<Card> hand = new ArrayList<Card>();
    double handValue=0;
    int playerNumber;
    Player(int playerNumber){
        this.playerNumber=playerNumber;
    }
    double playerMoney=0;
}
