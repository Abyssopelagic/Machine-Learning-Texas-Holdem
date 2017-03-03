package com.mygdx.project;


import java.io.*;
import java.util.Objects;

/**
 * Created by Keenan Baynard on 9/30/2016.
 */
public class Card implements Serializable {
    public String suit;
    public String value;

    Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public int getSuit() {
        switch (suit) {
            case "clubs":
                return 0;
            case "diamonds":
                return 1;
            case "hearts":
                return 2;
            case "spades":
                return 3;
        }
        return -1;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Card)) {
            return false;
        }

        Card c = (Card) o;

        return this.suit.equals(c.suit) && this.value.equals(c.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }
}
