package com.mygdx.project;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameScreen extends ApplicationAdapter {
    boolean handTies;
    boolean playerWins;
    boolean computerWins;

    SpriteBatch batch;

    Camera camera;
    Viewport viewport;
    Stage stage;
    BitmapFont font;
    FreeTypeFontGenerator gen;
    FreeTypeFontGenerator.FreeTypeFontParameter param;

    TextField raiseAmount;

    TextButton textButtonFlop;
    TextButton textButtonTurn;
    TextButton textButtonRiver;
    TextButton textButtonNewHand;

    TextButton callButton;
    TextButton checkButton;
    TextButton raiseButton;
    TextButton foldButton;
    Skin fieldSkin;

    static final int cardWidth = 500 / 5;
    static final int cardHeight = 726 / 5;
    static final int stageWidth = 800;
    static final int stageHeight = 600;
    ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> table = new ArrayList<Card>();
    static Player P1;
    static Player P2;
    int i = 1;

    @Override
    public void create() {
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        viewport = new FitViewport(stageWidth, stageHeight, camera);
        stage = new Stage(viewport, batch);
        gen = new FreeTypeFontGenerator(Gdx.files.internal("font/goodTimes.ttf"));
        param = new FreeTypeFontGenerator.FreeTypeFontParameter();
        param.size = 14;
        param.color = Color.BLACK;
        font = gen.generateFont(param);
        gen.dispose();

        testReadToFromFile reading = new testReadToFromFile();


        Gdx.graphics.setContinuousRendering(false);
        Gdx.graphics.requestRendering();
        Gdx.input.setInputProcessor(stage);

        fieldSkin = new Skin(Gdx.files.internal("uiskin.json"));
        raiseAmount = new TextField("", fieldSkin);
        raiseAmount.setPosition(470, 90);

        textButtonFlop = new TextButton("Flop", fieldSkin);
        textButtonTurn = new TextButton("Turn", fieldSkin);
        textButtonRiver = new TextButton("River", fieldSkin);
        textButtonFlop.setPosition(10, 400);
        textButtonFlop.setSize(100, 75);
        textButtonTurn.setPosition(120, 400);
        textButtonTurn.setSize(100, 75);
        textButtonRiver.setPosition(230, 400);
        textButtonRiver.setSize(100, 75);

        textButtonNewHand = new TextButton("New Hand", fieldSkin);
        textButtonNewHand.setPosition(340, 400);
        textButtonNewHand.setSize(100, 75);

        callButton = new TextButton("Call", fieldSkin);
        checkButton = new TextButton("Check", fieldSkin);
        raiseButton = new TextButton("Raise", fieldSkin);
        foldButton = new TextButton("Fold", fieldSkin);
        checkButton.setPosition(250, 10);
        checkButton.setSize(100, 75);
        callButton.setPosition(360, 10);
        callButton.setSize(100, 75);
        raiseButton.setPosition(470, 10);
        raiseButton.setSize(100, 75);
        foldButton.setPosition(580, 10);
        foldButton.setSize(100, 75);

        stage.addActor(textButtonFlop);
        stage.addActor(textButtonTurn);
        stage.addActor(textButtonRiver);
        stage.addActor(textButtonNewHand);

        stage.addActor(callButton);
        stage.addActor(checkButton);
        stage.addActor(raiseButton);
        stage.addActor(foldButton);

        raiseAmount.setText("");
        raiseAmount.setSize(100, 30);
        raiseAmount.setMessageText("Bet Amount");
        stage.addActor(raiseAmount);

        textButtonFlop.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (textButtonFlop.isChecked()) {
                    stage.getRoot().removeActor(textButtonFlop);
                    flop();
                }
            }
        });

        textButtonTurn.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (textButtonFlop.isChecked() && textButtonTurn.isChecked()) {
                    stage.getRoot().removeActor(textButtonTurn);
                    turnRiver();
                }
            }
        });

        textButtonRiver.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (textButtonFlop.isChecked() && textButtonTurn.isChecked() && textButtonRiver.isChecked()) {
                    stage.getRoot().removeActor(textButtonRiver);
                    turnRiver();
                }
            }
        });

        textButtonNewHand.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (textButtonFlop.isChecked() && textButtonTurn.isChecked() && textButtonRiver.isChecked()) {
                    clearAll();
                    textButtonRiver.setChecked(false);
                    textButtonTurn.setChecked(false);
                    textButtonFlop.setChecked(false);
                    textButtonNewHand.setChecked(false);
                    stage.addActor(textButtonFlop);
                    stage.addActor(textButtonTurn);
                    stage.addActor(textButtonRiver);
                }
            }
        });

        checkButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                checkBet();
                globalVariables.betAmount = 0;
            }
        });

        callButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (P1.playerMoney >= globalVariables.betAmount && !globalVariables.gameState.equals("raise")) {
                    callBet();
                    globalVariables.betAmount = 0;
                }
            }
        });

        raiseButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (!raiseAmount.getText().equals("")) {
                    if (P1.playerMoney >= Integer.valueOf(raiseAmount.getText())) {

                        raiseBet(Integer.valueOf(raiseAmount.getText()));
                        raiseAmount.setText("");
                    }
                }
            }
        });

        foldButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                foldHand();
                P2.playerMoney += globalVariables.potValue;
                globalVariables.potValue = 0;
                globalVariables.betAmount = 0;
                clearAll();
                textButtonRiver.setChecked(false);
                textButtonTurn.setChecked(false);
                textButtonFlop.setChecked(false);
                textButtonNewHand.setChecked(false);
                stage.addActor(textButtonFlop);
                stage.addActor(textButtonTurn);
                stage.addActor(textButtonRiver);
                raiseAmount.setText("");
            }
        });


        createDeck();
        createPlayers();
        shuffleDeck();
        dealPlayers();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, .3f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.getBatch().begin();

        drawCards(P1);
        drawCards(P2);
        drawTable(table);
        font.draw(batch, checkWin(P1), 10, cardHeight + 70);
        font.draw(batch, checkWin(P2), stageWidth - cardWidth * 2 - 150, stageHeight - cardHeight - 20);
        font.draw(batch, "Player money: $" + P1.playerMoney, 300, 200);
        font.draw(batch, "Pot money: $" + globalVariables.potValue, 100, stageHeight - 20);
        font.draw(batch, "Computer money: $" + P2.playerMoney, 100, stageHeight - 50);

        if (table.size() == 5) {
            if (getPlayer(P1).player.handValue > getPlayer(P2).player.handValue) {
                font.draw(batch, "Player Wins", 300, 150);
                playerWins=true;
            }
            else if (getPlayer(P1).player.handValue < getPlayer(P2).player.handValue) {
                font.draw(batch, "Computer Wins", 300, 150);
                computerWins=true;
            }
            else if (getPlayer(P1).player.handValue == getPlayer(P2).player.handValue) {
                Boolean tie=true;
                for (int i = 0; i < getPlayer(P1).kickers.size(); i++) {
                    if (getPlayer(P1).kickers.get(i) > getPlayer(P2).kickers.get(i)) {
                        font.draw(batch, "Player Wins", 300, 150);
                        playerWins=true;
                        tie=false;
                        break;
                    } else if (getPlayer(P1).kickers.get(i) < getPlayer(P2).kickers.get(i)) {
                        font.draw(batch, "Computer Wins", 300, 150);
                        computerWins=true;
                        tie=false;
                        break;
                    }
                }
                if (tie){
                    font.draw(batch,"Hand Ties",300,150);
                    handTies=true;
                }
            }
        }


        stage.getBatch().end();

        stage.draw();
    }

    @Override
    public void dispose() {
        batch.dispose();
        stage.dispose();
    }

    public void clearAll() {
        table.clear();
        deck.clear();
        createDeck();

        P1.handValue = 0;
        P1.hand.clear();
        P2.handValue = 0;
        P2.hand.clear();

        shuffleDeck();
        dealPlayers();
    }

    public void drawCards(Player player) {

        String card1 = "cards/" + runConsole.toValue.valueOf(player.hand.get(0).value).getValue() + "_of_" + player.hand.get(0).suit + ".png";
        String card2 = "cards/" + runConsole.toValue.valueOf(player.hand.get(1).value).getValue() + "_of_" + player.hand.get(1).suit + ".png";
        if (player.playerNumber == 1) {
            batch.draw(new Texture(card1), 10, 10, cardWidth, cardHeight);
            batch.draw(new Texture(card2), cardWidth + 20, 10, cardWidth, cardHeight);
        }
        if (player.playerNumber == 2) {
            batch.draw(new Texture(card1), stageWidth - cardWidth * 2 - 20, stageHeight - cardHeight - 10, cardWidth, cardHeight);
            batch.draw(new Texture(card2), stageWidth - cardWidth - 10, stageHeight - cardHeight - 10, cardWidth, cardHeight);
        }
    }

    public String checkWin(Player player) {
        ArrayList<Card> playerOneplusTable = new ArrayList<Card>();
        playerOneplusTable.addAll(player.hand);
        playerOneplusTable.addAll(table);
        winTest trywin = new winTest(playerOneplusTable);
        trywin.handCheck();
        String kickers = "";
        for (int value : trywin.kickers) {
            kickers += (String.valueOf(value) + " ");
        }
        return "Hand: " + trywin.set + "\nHand Value: " + trywin.player.handValue + "\nKicker: " + kickers + " High Card: " + trywin.highCard;
    }

    public winTest getPlayer(Player player) {
        ArrayList<Card> playerOneplusTable = new ArrayList<Card>();
        playerOneplusTable.addAll(player.hand);
        playerOneplusTable.addAll(table);
        winTest trywin = new winTest(playerOneplusTable);
        trywin.handCheck();
        return trywin;
    }

    public void drawTable(ArrayList<Card> table) {
        for (int i = 0; i < table.size(); i++) {
            String card = "cards/" + runConsole.toValue.valueOf(table.get(i).value).getValue() + "_of_" + table.get(i).suit + ".png";
            batch.draw(new Texture(card), 50 + i * 120, stageHeight / 2 - cardHeight / 2, cardWidth, cardHeight);
        }
    }

    public void createPlayers() {
        P1 = new Player(1);
        P1.playerMoney = 1000;
        P2 = new Player(2);
        P2.playerMoney = 1000;

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
        deck.remove(0);

        P2.hand.add(deck.get(0));
        deck.remove(0);

        P1.hand.add(deck.get(0));
        deck.remove(0);

        P2.hand.add(deck.get(0));
        deck.remove(0);
    }

    public void flop() {
        //burn 1
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

        //turn/river
        table.add(deck.get(0));
        deck.remove(0);
    }

    public void printCards(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.println(i++ + ": " + card.value + " of " + card.suit + ": " + runConsole.toValue.valueOf(card.value).getValue());
        }
    }

    public void shuffleDeck() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
        seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public void raiseBet(double bet) {
        globalVariables.betAmount = bet;
        globalVariables.potValue += bet;
        P1.playerMoney -= bet;
        globalVariables.gameState = "raise";
    }

    public void foldHand() {
        globalVariables.gameState = "fold";
    }

    public void checkBet() {
        globalVariables.gameState = "check";
    }

    public void callBet() {
        globalVariables.potValue += globalVariables.betAmount;
        P1.playerMoney -= globalVariables.betAmount;
        globalVariables.gameState = "call";
    }
}
