package com.mygdx.project;

import java.util.ArrayList;

/**
 * Created by ksbay on 9/30/2016.
 */
public class winTest {

    public ArrayList<Card> hand;
    public Player player = new Player(0);
    int[] amountOfCard = new int[15];
    int[] amountOfSuit = new int[4];
    ArrayList<Integer> kickers = new ArrayList<Integer>();

    int straighttop;

    boolean straight = false;
    boolean flush = false;

    String set;
    String royalFlushSuit;
    boolean pair = false;
    boolean threeOfAKind = false;
    boolean fourOfAKind = false;
    boolean twopair = false;
    boolean fullhouse = false;
    boolean straightflush = false;
    boolean royalflush = false;
    int highCard;
    int highCardFlush = 0;


    //reorder so best hand is checked first and then break if found
    public winTest(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void handCheck() {
        //array of amount of each number
        for (int number = 2; number < 15; number++) {
            for (Card card : hand) {
                if (runConsole.toValue.valueOf(card.value).getValue() == number) {
                    amountOfCard[number]++;
                }
            }
        }
        //array of amount of each suit
        for (int number = 20, rank = 0; number < 51; number += 10, rank++) {
            for (Card card : hand) {
                if (runConsole.toValue.valueOf(card.suit).getValue() == number) {
                    amountOfSuit[rank]++;
                }
            }
        }
        if (hand.size()==0){
            player.handValue=1;
            return;
        }

        //check high card
        for (int j = amountOfCard.length - 1; j >= 0; j--) {
            if (amountOfCard[j] > 0) {
                highCard = j;
                //hand value
                if (player.handValue < 15) {
                    player.handValue = highCard;
                    set = intToStringValue(highCard) + " High";
                    for (int i = j; i >= 0 && kickers.size() < 5; i--) {
                        if (amountOfCard[i] > 0) {
                            if (i >= 10) {
                                player.handValue = highCard + (i * 0.01);
                            } else {
                                player.handValue = highCard + (i * 0.001);
                            }

                            kickers.add(i);
                        }
                    }
                }
                break;
            }
        }

        //check sets
        for (int i = 0; i < amountOfCard.length; i++) {
            if (amountOfCard[i] > 1) {
                if (!threeOfAKind) {
                    pair = true;
                    //hand value
                    if (player.handValue < 100) {
                        kickers.clear();
                        player.handValue = 100 + i;
                        set = "Pair of " + intToStringValue(i) + "'s";
                        for (int j = highCard; j >= 0 && kickers.size() < 3; j--) {
                            if (amountOfCard[j] == 1) {
                                kickers.add(j);
                            }
                        }
                    }
                    if (amountOfCard[i] > 2) {
                        threeOfAKind = true;
                        //hand value
                        if (player.handValue < 300) {
                            kickers.clear();
                            player.handValue = 300 + i;
                            set = "Three " + intToStringValue(i) + "'s";
                            for (int j = highCard; j >= 0 && kickers.size() < 2; j--) {
                                if (amountOfCard[j] == 1) {
                                    kickers.add(j);
                                }
                            }
                        }
                        if (amountOfCard[i] > 3) {
                            fourOfAKind = true;
                            //hand value
                            if (player.handValue < 1500) {
                                kickers.clear();
                                player.handValue = 1500 + i;
                                set = "Four " + intToStringValue(i) + "'s";
                                for (int j = highCard; j >= 0 && kickers.size() < 1; j--) {
                                    if (amountOfCard[j] == 1) {
                                        kickers.add(j);
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
        //check two pair
        if (!threeOfAKind && !fourOfAKind) {
            for (int i = amountOfCard.length - 1; i >= 2; i--) {
                if (amountOfCard[i] == 2) {
                    if (i - 1 >= 2) {
                        for (int j = i - 1; j >= 2; j--) {
                            if (amountOfCard[j] == 2) {
                                twopair = true;
                                //hand value
                                if (player.handValue < 200) {
                                    kickers.clear();
                                    int max = i > j ? i : j;
                                    int min = i > j ? j : i;
                                    if (min >= 10) {
                                        player.handValue = 200 + max + (min * 0.01);
                                    } else {
                                        player.handValue = 200 + max + (min * 0.001);
                                    }
                                    set = "Two pair " + intToStringValue(i) + "'s" + " and " + intToStringValue(j) + "'s";
                                    for (int q = highCard; q >= 0 && kickers.size() < 1; q--) {
                                        if (amountOfCard[q] >= 1 && q != i && q != j) {
                                            kickers.add(q);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        //check straight
        for (int i = 14; i >= 6; i--) {
            if (amountOfCard[i] > 0 && amountOfCard[i - 1] > 0 && amountOfCard[i - 2] > 0
                    && amountOfCard[i - 3] > 0 && amountOfCard[i - 4] > 0) {
                straight = true;
                straighttop = i;
                //hand value
                if (player.handValue < 400) {
                    kickers.clear();
                    player.handValue = 400 + straighttop - 4;
                    set = "Straight " + intToStringValue((straighttop - 4)) + " Through " + intToStringValue(straighttop);
                }
                break;
            }
        }
        //check for flush
        for (int i = 0; i < amountOfSuit.length; i++) {
            if (amountOfSuit[i] >= 5) {
                flush = true;
                //hand value
                if (player.handValue < 500) {
                    kickers.clear();
                    for (Card card : hand) {
                        if (card.suit.equals(intToSuit(i))) {
                            if (runConsole.toValue.valueOf(card.value).getValue() > highCardFlush) {
                                highCardFlush = runConsole.toValue.valueOf(card.value).getValue();
                            }
                        }
                    }
                    player.handValue = 500 + highCardFlush;
                    if (i == 0) {
                        set = intToStringValue(highCardFlush) + " High, Heart Flush";
                    }
                    if (i == 1) {
                        set = intToStringValue(highCardFlush) + " High, Diamond Flush";
                    }
                    if (i == 2) {
                        set = intToStringValue(highCardFlush) + " High, Spade Flush";
                    }
                    if (i == 3) {
                        set = intToStringValue(highCardFlush) + " High, Club Flush";
                    }
                }
                break;
            }
        }

        //check full house
        if (!fourOfAKind) {
            for (int i = 0; i < amountOfCard.length; i++) {
                if (amountOfCard[i] == 2) {
                    if (i + 1 < amountOfCard.length) {
                        for (int j = i + 1; j < amountOfCard.length; j++) {
                            if (amountOfCard[j] == 3) {
                                fullhouse = true;
                                //hand value
                                if (player.handValue < 600) {
                                    kickers.clear();
                                    if (i >= 10) {
                                        player.handValue = 600 + j + (i * 0.01);
                                    } else {
                                        player.handValue = 600 + j + (i * 0.001);
                                    }
                                    set = "Full house " + intToStringValue(j) + "'s " + "over " + intToStringValue(i) + "'s";
                                }
                            }
                        }
                    }
                }
            }
        }
        //check straight flush
        String suitOf5 = "5";
        String suitOf4 = "4";
        String suitOf3 = "3";
        String suitOf2 = "2";
        String suitOf1 = "1";
        if (straight && flush) {
            for (Card card : hand) {
                if (runConsole.toValue.valueOf(card.value).getValue() == straighttop) {
                    suitOf5 = card.suit;
                }
            }
            for (Card card : hand) {
                if (runConsole.toValue.valueOf(card.value).getValue() == straighttop - 1) {
                    suitOf4 = card.suit;
                }
            }
            for (Card card : hand) {
                if (runConsole.toValue.valueOf(card.value).getValue() == straighttop - 2) {
                    suitOf3 = card.suit;
                }
            }
            for (Card card : hand) {
                if (runConsole.toValue.valueOf(card.value).getValue() == straighttop - 3) {
                    suitOf2 = card.suit;
                }
            }
            for (Card card : hand) {
                if (runConsole.toValue.valueOf(card.value).getValue() == straighttop - 4) {
                    suitOf1 = card.suit;
                }
            }
            if (suitOf5.equals(suitOf4) && suitOf5.equals(suitOf3) && suitOf5.equals(suitOf2) && suitOf5.equals(suitOf1)) {
                straightflush = true;
                //hand value
                if (player.handValue < 2000) {
                    kickers.clear();
                    player.handValue = 2000 + straighttop;
                    set = intToStringValue(straighttop) + " High, " + suitOf5 + " Straight Flush";
                    royalFlushSuit = suitOf5;
                }
            }
        }
        //check royal flush
        if (straightflush && straighttop == 14) {
            royalflush = true;
            //hand value
            player.handValue = 3000;
            kickers.clear();
            set = royalFlushSuit + " Royal Flush";
        }
    }

    public String intToStringValue(int value) {
        switch (value) {
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                return "Ace";
        }
        return null;
    }

    public String intToSuit(int value) {
        switch (value) {
            case 0:
                return "hearts";
            case 1:
                return "diamonds";
            case 2:
                return "spades";
            case 3:
                return "clubs";
        }
        return null;
    }
}
