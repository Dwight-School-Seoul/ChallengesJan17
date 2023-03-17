package WarCardGame;

import Main.*;
import java.util.*;

public class WarGame {

    private static final Scanner scan = new Scanner(System.in);
    private static String name1;
    private static String name2;
    private static final int cards = 52;
    private static String[] player1Cards;
    private static String[] player2Cards;
    private static final String[] cardsValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final String[] cardsSuits = {"clubs", "diamonds", "hearts", "spades"};
    private static final String[] cardsArray = { "2 clubs", "3 clubs", "4 clubs", "5 clubs", "6 clubs", "7 clubs", "8 clubs", "9 clubs", "10 clubs", "J clubs", "Q clubs", "K clubs", "A clubs", "2 diamonds", "3 diamonds", "4 diamonds", "5 diamonds", "6 diamonds", "7 diamonds", "8 diamonds", "9 diamonds", "10 diamonds", "J diamonds", "Q diamonds", "K diamonds", "A diamonds", "2 hearts", "3 hearts", "4 hearts", "5 hearts", "6 hearts", "7 hearts", "8 hearts", "9 hearts", "10 hearts", "J hearts", "Q hearts", "K hearts", "A hearts", "2 spades", "3 spades", "4 spades", "5 spades", "6 spades", "7 spades", "8 spades", "9 spades", "10 spades", "J spades", "Q spades", "K spades", "A spades"};
    public static void LForLosers(){
        System.out.println("{");
        for (String cardsSuit : cardsSuits) {
            for (String cardsValue : cardsValues) {
                System.out.printf("%s %s, ", cardsValue, cardsSuit);
            }
        }
        System.out.println("}");
    }

    public WarGame(String player1Name, String Player2Name) {
        WarGame.name1 = player1Name;
        WarGame.name2 = Player2Name;

        System.out.printf(CC.YELLOW+"\n%s Joined the game...\n",name1);
        System.out.printf(CC.YELLOW+"%s Joined the game...\n",name2);
    }

    public static void play() {
        try{
            String[] cards = cardsArray.clone();

            String[] player1Cards = new String[26];
            String[] player2Cards = new String[26];

            Set<String> dealtCards = new HashSet<>();

            int i = 0;
            while (i < 26) {
                String chosenCard = While.getRandom(cardsArray);
                if (!dealtCards.contains(chosenCard)) {
                    dealtCards.add(chosenCard);
                    player1Cards[i] = chosenCard;
                    i++;
                }
            }

            i = 0;
            for (String card : cardsArray) {
                if (!dealtCards.contains(card)) {
                    player2Cards[i] = card;
                    i++;
                }
            }

            Collections.shuffle(Arrays.asList(player1Cards));
            Collections.shuffle(Arrays.asList(player2Cards));

            System.out.printf(CC.GREEN_BRIGHT+"\n%s cards: %s%s\n",name1, CC.RESET, Arrays.toString(player1Cards));
            System.out.printf(CC.GREEN_BRIGHT+"%s cards: %s%s",name2, CC.RESET, Arrays.toString(player2Cards));

            int roundNum = 1;
            int p1Wins = 0;
            int p2Wins = 0;

            while (p1Wins < 10 && p2Wins < 10) {

                System.out.printf(CC.BLUE_BRIGHT+"\n\n*** Round %d ***\n\n", roundNum);

                String p1Card = player1Cards[0];
                String p2Card = player2Cards[0];

                System.out.printf(CC.GREEN_BRIGHT+"%s's card: %s\n", name1, p1Card);
                System.out.printf(CC.GREEN_BRIGHT+"%s's card: %s\n", name2, p2Card);

                int p1Value = Arrays.asList(cardsValues).indexOf(p1Card.split(" ")[0]);
                int p2Value = Arrays.asList(cardsValues).indexOf(p2Card.split(" ")[0]);

                if (p1Value > p2Value) {
                    System.out.printf(CC.YELLOW_BRIGHT+"%s wins the round!\n", name1);
                    player1Cards = Arrays.copyOfRange(player1Cards, 1, player1Cards.length);
                    player2Cards = Arrays.copyOfRange(player2Cards, 1, player2Cards.length);
                    player1Cards = Arrays.copyOf(player1Cards, player1Cards.length + 1);
                    player1Cards[player1Cards.length - 1] = p1Card;
                    player1Cards = Arrays.copyOf(player1Cards, player1Cards.length + 1);
                    player1Cards[player1Cards.length - 1] = p2Card;
                    p1Wins++;
                } else if (p2Value > p1Value) {
                    System.out.printf(CC.YELLOW_BRIGHT+"%s wins the round!\n", name2);
                    player1Cards = Arrays.copyOfRange(player1Cards, 1, player1Cards.length);
                    player2Cards = Arrays.copyOfRange(player2Cards, 1, player2Cards.length);
                    player2Cards = Arrays.copyOf(player2Cards, player2Cards.length + 1);
                    player2Cards[player2Cards.length - 1] = p1Card;
                    player2Cards = Arrays.copyOf(player2Cards, player2Cards.length + 1);
                    player2Cards[player2Cards.length - 1] = p2Card;
                    p2Wins++;
                } else {
                    System.out.printf(CC.YELLOW_BRIGHT+"It's a tie!\n");
                    player1Cards = Arrays.copyOfRange(player1Cards, 1, player1Cards.length);
                    player2Cards = Arrays.copyOfRange(player2Cards, 1, player2Cards.length);
                    player1Cards = Arrays.copyOf(player1Cards, player1Cards.length + 1);
                    player1Cards[player1Cards.length - 1] = p1Card;
                    player2Cards = Arrays.copyOf(player2Cards, player2Cards.length + 1);
                    player2Cards[player2Cards.length - 1] = p2Card;
                }

                roundNum++;
            }

            if (p1Wins == 3) {
                System.out.printf(CC.RED_BRIGHT+"\n%s wins the game!\n", name1);
            } else {
                System.out.printf(CC.RED_BRIGHT+"\n%s wins the game!\n", name2);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }



}