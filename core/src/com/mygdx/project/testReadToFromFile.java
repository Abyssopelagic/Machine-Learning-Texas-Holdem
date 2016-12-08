package com.mygdx.project;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ksbay on 11/29/2016.
 */
public class testReadToFromFile {
    HashMap<String, Integer> writeTo = new HashMap<String, Integer>();
    HashMap<String, Integer> readFrom = new HashMap<String, Integer>();
    HashMap<Object, Vector2> problist;

    testReadToFromFile() {
        writeTo.putIfAbsent("One", 1);
        writeTo.putIfAbsent("Two", 2);
        writeTo.putIfAbsent("Three", 3);
        writeTo.putIfAbsent("Four", 4);
        writeTo.putIfAbsent("Five", 5);
//        writeToFile();
//        readFromFile();
//
//        Gdx.app.log("",""+readFrom.get("One"));
//        Gdx.app.log("",""+readFrom.get("Two"));
//        Gdx.app.log("",""+readFrom.get("Three"));
//        Gdx.app.log("",""+readFrom.get("Four"));
//        Gdx.app.log("",""+readFrom.get("Five"));

    }

    public void writeToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/tests.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(writeTo);
            out.close();
            fileOut.close();
            Gdx.app.log("", "serialized data");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void readFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream("probabilities/tests.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            readFrom = (HashMap<String, Integer>) in.readObject();
            in.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            Gdx.app.log("", "Map class not found");
            c.printStackTrace();
            return;
        }
    }

    public HashMap<Object,Vector2> getProblist(){
        try {
            FileInputStream fileIn = new FileInputStream("probabilities/tests.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            problist = (HashMap<Object,Vector2>) in.readObject();
            in.close();
            return problist;
        }catch (IOException i){
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c){
            Gdx.app.error("Class not found",""+problist.getClass());
            c.printStackTrace();
            return null;
        }
    }

    public void saveProblist(HashMap<Object,Vector2> problst){
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/tests.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(problst);
            out.close();
            fileOut.close();
            Gdx.app.log("Serialized","Data");
        } catch (IOException i){
            i.printStackTrace();
        }
    }

    public void updateProbabality(int winLose, ArrayList<Card> state) {

        if (problist.get(state) != null) {
            Vector2 updateProb = problist.get(state);

            updateProb.x += winLose;
            updateProb.y++;

            problist.put(state, updateProb);
        } else {
            problist.put(state, new Vector2(winLose, 1));
        }
    }

    public float getProbablity(ArrayList<Card> state) {
        Vector2 tempProb = problist.get(state);
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

    public double getExpectedValue(double prob){
        return prob*globalVariables.potValue-(1-prob)*globalVariables.betAmount;
    }

    public void actionGivenState(String action, ArrayList<Card> state){

    }
}
