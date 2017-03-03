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
    boolean handTies = false;
    boolean playerWins = false;
    boolean computerWins = false;

    SpriteBatch batch;

    String playerPreFlopAction="";
    String playerFlopAction="";
    String playerTurnAction="";
    String playerRiverAction="";

    getProbAndSave probAndSave;
    gettingData getData;
    ArrayList<Card> playerOneplusTable;
    boolean preflopturn;
    boolean flopturn;
    boolean turnturn;
    boolean riverturn;

    Camera camera;
    Viewport viewport;
    Stage stage;
    BitmapFont font;
    BitmapFont fontEnd;
    BitmapFont fontEndSub;
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
    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> table = new ArrayList<>();
    static Player P1;
    static Player P2;
    int i = 1;

    decisionState decisionState;

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
        param.size = 80;
        fontEnd = gen.generateFont(param);
        param.size = 40;
        fontEndSub = gen.generateFont(param);
        gen.dispose();

        probAndSave = new getProbAndSave();
        getData = new gettingData();
        decisionState = new decisionState();


        Gdx.graphics.setContinuousRendering(false);
        Gdx.graphics.requestRendering();
        Gdx.input.setInputProcessor(stage);

        fieldSkin = new Skin(Gdx.files.internal("uiskin.json"));
        raiseAmount = new TextField("", fieldSkin);
        raiseAmount.setPosition(470, 90);

//        textButtonFlop = new TextButton("Flop", fieldSkin);
//        textButtonTurn = new TextButton("Turn", fieldSkin);
//        textButtonRiver = new TextButton("River", fieldSkin);
//        textButtonFlop.setPosition(10, 400);
//        textButtonFlop.setSize(100, 75);
//        textButtonTurn.setPosition(120, 400);
//        textButtonTurn.setSize(100, 75);
//        textButtonRiver.setPosition(230, 400);
//        textButtonRiver.setSize(100, 75);

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

//        stage.addActor(textButtonFlop);
//        stage.addActor(textButtonTurn);
//        stage.addActor(textButtonRiver);
        stage.addActor(textButtonNewHand);

        stage.addActor(callButton);
        stage.addActor(checkButton);
        stage.addActor(raiseButton);
        stage.addActor(foldButton);

        raiseAmount.setText("");
        raiseAmount.setSize(100, 30);
        raiseAmount.setMessageText("Bet Amount");
        stage.addActor(raiseAmount);

//        textButtonFlop.addListener(new ChangeListener() {
//            @Override
//            public void changed(ChangeEvent event, Actor actor) {
//                if (table.size() == 0) {
//                    flop();
//                }
//            }
//        });
//
//        textButtonTurn.addListener(new ChangeListener() {
//            @Override
//            public void changed(ChangeEvent event, Actor actor) {
//                if (table.size() == 3) {
//                    turnRiver();
//                }
//            }
//        });
//
//        textButtonRiver.addListener(new ChangeListener() {
//            @Override
//            public void changed(ChangeEvent event, Actor actor) {
//                if (table.size() == 4) {
//                    turnRiver();
//                }
//            }
//        });

        textButtonNewHand.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (globalVariables.cardState.equals("end") && table.size() == 5) {
                    clearAll();
                    globalVariables.potValue = globalVariables.smallBlindAmount+globalVariables.bigBlindAmount;
                    globalVariables.betAmount = globalVariables.smallBlindAmount;
                    if (globalVariables.smallBlind.equals("computer")){
                        P1.playerMoney-=globalVariables.bigBlindAmount;
                        P2.playerMoney-=globalVariables.smallBlindAmount;
                    } else {
                        P1.playerMoney-=globalVariables.smallBlindAmount;
                        P2.playerMoney-=globalVariables.bigBlindAmount;
                    }
//                    textButtonRiver.setChecked(false);
//                    textButtonTurn.setChecked(false);
//                    textButtonFlop.setChecked(false);
                    textButtonNewHand.setChecked(false);
//                    stage.addActor(textButtonFlop);
//                    stage.addActor(textButtonTurn);
//                    stage.addActor(textButtonRiver);
                    preflopturn = true;
                    flopturn = false;
                    turnturn = false;
                    riverturn = false;
                    globalVariables.playState = "";
                    globalVariables.cardState = "preflop";
                    globalVariables.computerAction = "";
                    handTies = false;
                    playerWins = false;
                    computerWins = false;
                    globalVariables.handOver = true;

                    playerPreFlopAction="";
                    playerFlopAction="";
                    playerTurnAction="";
                    playerRiverAction="";

                    if (globalVariables.smallBlind.equals("computer")){
                        globalVariables.smallBlind="player";
                    } else {
                        globalVariables.smallBlind="computer";
                    }
                    Gdx.graphics.requestRendering();
                }
            }
        });

        checkButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (globalVariables.betAmount == 0) {
                    switch (globalVariables.cardState){
                        case "preflop":
                            playerPreFlopAction="check";
                        case "flop":
                            playerFlopAction="check";
                        case "turn":
                            playerTurnAction="check";
                        case "river":
                            playerRiverAction="check";
                    }
                    checkBet();
                    globalVariables.betAmount = 0;
                    globalVariables.computerAction = "";

                    if (globalVariables.smallBlind.equals("computer")) {
                        decisionState.getDecision(getPlayer(P2).player.handValue, P2, table, P1);
                    }
                    Gdx.graphics.requestRendering();

                }
            }
        });

        callButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (P1.playerMoney >= globalVariables.betAmount && globalVariables.betAmount!=0) {
                    switch (globalVariables.cardState){
                        case "preflop":
                            playerPreFlopAction="call";
                        case "flop":
                            playerFlopAction="call";
                        case "turn":
                            playerTurnAction="call";
                        case "river":
                            playerRiverAction="call";
                    }
                    callBet();
                    globalVariables.betAmount = 0;
                    switch (globalVariables.cardState) {
                        case "preflop":
                            if (globalVariables.smallBlind.equals("player")&&globalVariables.cardState.equals("preflop")){
                                decisionState.getDecision(getPlayer(P2).player.handValue, P2, table, P1);
                            }else {
                                globalVariables.cardState = "flop";
                            }
                            break;
                        case "flop":
                            globalVariables.cardState = "turn";
                            break;
                        case "turn":
                            globalVariables.cardState = "river";
                            break;
                        case "river":
                            globalVariables.cardState = "end";
                            break;
                    }
                    globalVariables.computerAction = "";


                    Gdx.graphics.requestRendering();
                }

            }
        });

        raiseButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (!raiseAmount.getText().equals("") && P1.playerMoney >= Double.valueOf(raiseAmount.getText())) {
                    switch (globalVariables.cardState){
                        case "preflop":
                            playerPreFlopAction="raise";
                        case "flop":
                            playerFlopAction="raise";
                        case "turn":
                            playerTurnAction="raise";
                        case "river":
                            playerRiverAction="raise";
                    }
                    raiseBet(Double.valueOf(raiseAmount.getText()));
                    raiseAmount.setText("");
                    globalVariables.computerAction = "";
                    decisionState.getDecision(getPlayer(P2).player.handValue, P2, table, P1);



                    Gdx.graphics.requestRendering();
                }
            }
        });

        foldButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                //foldHand();
                P2.playerMoney += globalVariables.potValue;
                globalVariables.potValue = globalVariables.smallBlindAmount+globalVariables.bigBlindAmount;
                globalVariables.betAmount = globalVariables.smallBlindAmount;
                if (globalVariables.smallBlind.equals("computer")){
                    P1.playerMoney-=globalVariables.bigBlindAmount;
                    P2.playerMoney-=globalVariables.smallBlindAmount;
                } else {
                    P1.playerMoney-=globalVariables.smallBlindAmount;
                    P2.playerMoney-=globalVariables.bigBlindAmount;
                }
                clearAll();
//                textButtonRiver.setChecked(false);
//                textButtonTurn.setChecked(false);
//                textButtonFlop.setChecked(false);
                textButtonNewHand.setChecked(false);
//                stage.addActor(textButtonFlop);
//                stage.addActor(textButtonTurn);
//                stage.addActor(textButtonRiver);
                raiseAmount.setText("");
                preflopturn = true;
                flopturn = false;
                turnturn = false;
                riverturn = false;
                globalVariables.playState = "";
                globalVariables.cardState = "preflop";
                globalVariables.computerAction = "";
                handTies = false;
                playerWins = false;
                computerWins = false;
                globalVariables.handOver = true;

                playerPreFlopAction="";
                playerFlopAction="";
                playerTurnAction="";
                playerRiverAction="";

                if (globalVariables.smallBlind.equals("computer")){
                    globalVariables.smallBlind="player";
                } else {
                    globalVariables.smallBlind="computer";
                }

                Gdx.graphics.requestRendering();
            }
        });


        createDeck();
        createPlayers();
        shuffleDeck();
        dealPlayers();

        probAndSave.getProblist("serializedWinGivenStatePreFlop");
        probAndSave.getProblist("serializedWinGivenStateFlop");
        probAndSave.getProblist("serializedWinGivenStateTurn");
        probAndSave.getProblist("serializedWinGivenStateRiver");

        getData.getMaps("probabilityOfHand");


        getData.getMaps("playerCards");
        getData.getMaps("tableCards");
        getData.getCards();
        getData.getTable();
        getData.getMaps("preFlopActions");
        getData.getMaps("flopActions");
        getData.getMaps("turnActions");
        getData.getMaps("riverActions");
        getData.getMaps("preFlopActionMapCount");
        getData.getMaps("flopActionMapCount");
        getData.getMaps("turnActionMapCount");
        getData.getMaps("riverActionMapCount");
        getData.getMaps("preFlopStateMap");
        getData.getMaps("flopStateMap");
        getData.getMaps("turnStateMap");
        getData.getMaps("riverStateMap");


        preflopturn = true;
        flopturn = false;
        turnturn = false;
        riverturn = false;

    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(0, .3f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.getBatch().begin();

        drawCards(P1);
        drawCards(P2);

        if (P1.playerMoney == 0 && globalVariables.cardState.equals("end")) {
            fontEnd.draw(batch, "Game Over", 100, 350);
            fontEndSub.draw(batch, "Computer Win's", 180, 280);
        } else if (P2.playerMoney == 0 && globalVariables.cardState.equals("end")) {
            fontEnd.draw(batch, "Game Over", 100, 350);
            fontEndSub.draw(batch, "Player Win's", 220, 280);
        } else {
            drawTable(table);
        }

        font.draw(batch, checkHand(P1), 10, cardHeight + 70);

        if (table.size() == 5 && globalVariables.cardState.equals("end")) {
            font.draw(batch, checkHand(P2), stageWidth - cardWidth * 2 - 150, stageHeight - cardHeight - 20);
        }
        if (globalVariables.smallBlind.equals("computer")) {
            font.draw(batch, "Player is big blind", 30, stageHeight - 150);
        } else {
            font.draw(batch,"Player is small blind",30,stageHeight-150);
        }

        font.draw(batch, "Player money: $" + P1.playerMoney, 300, 200);
        font.draw(batch, "Pot money: $" + globalVariables.potValue, 100, stageHeight - 20);
        font.draw(batch, "Computer money: $" + P2.playerMoney, 100, stageHeight - 50);

        font.draw(batch, "play state: " + globalVariables.playState, 20, stageHeight - 70);
        font.draw(batch, "card state: " + globalVariables.cardState, 20, stageHeight - 90);
        font.draw(batch, "computer action: " + globalVariables.computerAction, 20, stageHeight - 110);

        printWinner();

        stage.getBatch().end();

        stage.draw();

        if (globalVariables.smallBlind.equals("computer") && globalVariables.computerAction.equals("") && globalVariables.cardState.equals("preflop")) {
            decisionState.getDecision(getPlayer(P2).player.handValue, P2, table, P1);
        }

        if (table.size() == 0 && preflopturn) {
            probAndSave.populateProbList(playerOneplusTable, getPlayer(P2).player.handValue, getPlayer(P1), getPlayer(P2), table);
            preflopturn = false;
            flopturn = true;
        } else if (table.size() == 3 && flopturn) {
            probAndSave.populateProbList(playerOneplusTable, getPlayer(P2).player.handValue, getPlayer(P1), getPlayer(P2), table);
            flopturn = false;
            turnturn = true;
        } else if (table.size() == 4 && turnturn) {
            probAndSave.populateProbList(playerOneplusTable, getPlayer(P2).player.handValue, getPlayer(P1), getPlayer(P2), table);
            turnturn = false;
            riverturn = true;
        } else if (table.size() == 5 && riverturn) {
            probAndSave.populateProbList(playerOneplusTable, getPlayer(P2).player.handValue, getPlayer(P1), getPlayer(P2), table);
            riverturn = false;
        }
        if (globalVariables.cardState.equals("flop") && table.size() == 0) {
            flop();
        } else if (globalVariables.cardState.equals("turn") && table.size() == 3) {
            turnRiver();
        } else if (globalVariables.cardState.equals("river") && table.size() == 4) {
            turnRiver();
        }
        if (globalVariables.playState.equals("fold")) {
            P1.playerMoney += globalVariables.potValue;
            globalVariables.potValue = globalVariables.smallBlindAmount+globalVariables.bigBlindAmount;
            globalVariables.betAmount = globalVariables.smallBlindAmount;
            if (globalVariables.smallBlind.equals("computer")){
                P1.playerMoney-=globalVariables.bigBlindAmount;
                P2.playerMoney-=globalVariables.smallBlindAmount;
            } else {
                P1.playerMoney-=globalVariables.smallBlindAmount;
                P2.playerMoney-=globalVariables.bigBlindAmount;
            }
            clearAll();
//            textButtonRiver.setChecked(false);
//            textButtonTurn.setChecked(false);
//            textButtonFlop.setChecked(false);
            textButtonNewHand.setChecked(false);
//            stage.addActor(textButtonFlop);
//            stage.addActor(textButtonTurn);
//            stage.addActor(textButtonRiver);
            raiseAmount.setText("");
            preflopturn = true;
            flopturn = false;
            turnturn = false;
            riverturn = false;
            globalVariables.cardState = "preflop";
            globalVariables.playState = "";
            globalVariables.computerAction = "fold";
            globalVariables.handOver = true;

            playerPreFlopAction="";
            playerFlopAction="";
            playerTurnAction="";
            playerRiverAction="";

            if (globalVariables.smallBlind.equals("computer")){
                globalVariables.smallBlind="player";
            } else {
                globalVariables.smallBlind="computer";
            }

        }

        if (globalVariables.cardState.equals("end") && globalVariables.handOver) {
            giveWinnings();
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        stage.dispose();
        probAndSave.saveProblist(globalVariables.winGivenStatePreFlop, "serializedWinGivenStatePreFlop");
        probAndSave.saveProblist(globalVariables.winGivenStateFlop, "serializedWinGivenStateFlop");
        probAndSave.saveProblist(globalVariables.winGivenStateTurn, "serializedWinGivenStateTurn");
        probAndSave.saveProblist(globalVariables.winGivenStateRiver, "serializedWinGivenStateRiver");
        getData.saveActionsAndCards();
        getData.saveMaps();
        getData.saveStrings();
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
        String cardback = "cards/cardback.png";
        if (player.playerNumber == 1) {
            batch.draw(new Texture(card1), 10, 10, cardWidth, cardHeight);
            batch.draw(new Texture(card2), cardWidth + 20, 10, cardWidth, cardHeight);
        }
        if (!globalVariables.cardState.equals("end") && player.playerNumber == 2) {
            batch.draw(new Texture(cardback), stageWidth - cardWidth * 2 - 20, stageHeight - cardHeight - 10, cardWidth, cardHeight);
            batch.draw(new Texture(cardback), stageWidth - cardWidth - 10, stageHeight - cardHeight - 10, cardWidth, cardHeight);
        }
        if (table.size() == 5 && globalVariables.cardState.equals("end")) {
            if (player.playerNumber == 2) {
                batch.draw(new Texture(card1), stageWidth - cardWidth * 2 - 20, stageHeight - cardHeight - 10, cardWidth, cardHeight);
                batch.draw(new Texture(card2), stageWidth - cardWidth - 10, stageHeight - cardHeight - 10, cardWidth, cardHeight);
            }
        }
    }

    public void printWinner() {
        if (table.size() == 5 && globalVariables.cardState.equals("end")) {
            if (getPlayer(P1).player.handValue > getPlayer(P2).player.handValue) {
                font.draw(batch, "Player Wins", 300, 150);
                playerWins = true;
            } else if (getPlayer(P1).player.handValue < getPlayer(P2).player.handValue) {
                font.draw(batch, "Computer Wins", 300, 150);
                computerWins = true;

            } else if (getPlayer(P1).player.handValue == getPlayer(P2).player.handValue) {
                Boolean tie = true;
                for (int i = 0; i < getPlayer(P1).kickers.size(); i++) {
                    if (getPlayer(P1).kickers.get(i) > getPlayer(P2).kickers.get(i)) {
                        font.draw(batch, "Player Wins", 300, 150);
                        playerWins = true;
                        tie = false;
                        break;
                    } else if (getPlayer(P1).kickers.get(i) < getPlayer(P2).kickers.get(i)) {
                        font.draw(batch, "Computer Wins", 300, 150);
                        computerWins = true;
                        tie = false;
                        break;
                    }
                }
                if (tie) {
                    font.draw(batch, "Hand Ties", 300, 150);
                    handTies = true;
                }
            }
        }
    }

    public void giveWinnings() {
        if (handTies) {
            P1.playerMoney += globalVariables.potValue / 2;
            P2.playerMoney += globalVariables.potValue / 2;
        } else if (playerWins) {
            P1.playerMoney += globalVariables.potValue;
        } else if (computerWins) {
            P2.playerMoney += globalVariables.potValue;
        }
        globalVariables.handOver = false;

        globalVariables.preFlopAction.add(playerPreFlopAction);
        globalVariables.flopAction.add(playerFlopAction);
        globalVariables.turnAction.add(playerTurnAction);
        globalVariables.riverAction.add(playerRiverAction);
        globalVariables.playerCards.add(cardsToString(P1.hand));
        globalVariables.tableCards.add(cardsToString(table));

        System.out.println("preflop: "+playerPreFlopAction);
        System.out.println("flop: "+playerFlopAction);
        System.out.println("turn: "+playerTurnAction);
        System.out.println("river: "+playerRiverAction);
        System.out.println(cardsToString(P1.hand));
        System.out.println(cardsToString(table));
    }

    public String checkHand(Player player) {
        playerOneplusTable = new ArrayList<>();
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
        playerOneplusTable = new ArrayList<>();
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
        int startingMoney = 10000;
        P1 = new Player(1);
        P2 = new Player(2);
        if (globalVariables.smallBlind.equals("computer")) {
            P1.playerMoney = startingMoney - globalVariables.bigBlindAmount;
            P2.playerMoney = startingMoney - globalVariables.smallBlindAmount;
        } else {
            P1.playerMoney = startingMoney - globalVariables.smallBlindAmount;
            P2.playerMoney = startingMoney - globalVariables.bigBlindAmount;
        }


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
        if (globalVariables.smallBlind.equals("computer")) {
            globalVariables.playerAction = "";
        } else {
            decisionState.getDecision(getPlayer(P2).player.handValue, P2, table, P1);
        }
    }

    public void turnRiver() {
        //burn 1
        deck.remove(0);

        //turn/river
        table.add(deck.get(0));
        deck.remove(0);
        if (globalVariables.smallBlind.equals("computer")) {
            globalVariables.playerAction = "";
        } else {
            decisionState.getDecision(getPlayer(P2).player.handValue, P2, table, P1);
        }

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
        globalVariables.playState = "raise";
    }

    public void foldHand() {
        globalVariables.playState = "fold";
    }

    public void checkBet() {
        globalVariables.playState = "check";
        if (globalVariables.smallBlind.equals("player") || globalVariables.cardState.equals("preflop")){
            globalVariables.playState="";
            switch (globalVariables.cardState){
                case "preflop":
                    globalVariables.cardState="flop";
                    break;
                case "flop":
                    globalVariables.cardState="turn";
                    break;
                case "turn":
                    globalVariables.cardState="river";
                    break;
                case "river":
                    globalVariables.cardState="end";
            }
        }

    }

    public void callBet() {
        globalVariables.potValue += globalVariables.betAmount;
        P1.playerMoney -= globalVariables.betAmount;
        globalVariables.playState = "call";
        if (globalVariables.smallBlind.equals("player")) {
            globalVariables.playState = "";
        }
    }

    public String cardsToString(ArrayList<Card> cards){
        String cardValue;
        String cardSuit;
        String cardString="";
        for (Card card: cards){
            cardValue=card.value;
            cardSuit=card.suit;
            switch (card.value){
                case "two": cardValue="2";
                break;
                case "three":cardValue="3";
                break;
                case "four":cardValue="4";
                break;
                case "five":cardValue="5";
                break;
                case "six":cardValue="6";
                break;
                case "seven":cardValue="7";
                break;
                case "eight":cardValue="8";
                break;
                case "nine":cardValue="9";
                break;
                case "ten":cardValue="T";
                break;
                case "jack":cardValue="J";
                break;
                case "queen":cardValue="Q";
                break;
                case "king":cardValue="K";
                break;
                case "ace":cardValue="A";
            }
            switch (card.suit){
                case "clubs": cardSuit="c";
                break;
                case "diamonds": cardSuit="d";
                break;
                case "hearts":cardSuit="h";
                break;
                case "spades":cardSuit="s";
            }
            cardString+=cardValue+cardSuit+" ";
        }
        return cardString;
    }
}
