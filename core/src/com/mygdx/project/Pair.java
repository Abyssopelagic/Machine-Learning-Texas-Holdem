package com.mygdx.project;

/**
 * Created by Keenan Baynard on 2/23/2017.
 */
public class Pair<A, B> {
    public A action;
    public B cardValue;

    public Pair(A action, B cardValue) {
        super();
        this.action = action;
        this.cardValue = cardValue;
    }

    public int hashCode() {
        int hashAction = action != null ? action.hashCode() : 0;
        int hashCardValue = cardValue != null ? cardValue.hashCode() : 0;

        return (hashAction + hashCardValue) * hashCardValue * hashAction;
    }

    public boolean equals(Object o) {
        if (o instanceof Pair) {
            Pair oPair = (Pair) o;
            return ((this.action == oPair.action ||
                    (this.action != null && oPair.action != null &&
                            this.cardValue.equals(oPair.action))) &&
                    (this.cardValue == oPair.cardValue ||
                            (this.cardValue != null && oPair.cardValue != null &&
                                    this.cardValue.equals(oPair.cardValue))));
        }
        return false;
    }
}
