package Challenges;

import java.util.Random;
import java.util.Scanner;
import Main.*;

public class GuessingGame {

    public static void main(){

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int level, target, numberGuesses;

        while (true) {
            System.out.println(CC.BLUE+"\n\n------> Welcome to my Guessing Game <------"+ CC.RESET);
            System.out.printf(" \n > Enter a level \n\n      %s\"1\" for Easy \n      %s\"2\" for Medium \n      %s\"3\" for Hard \n\n %s> What is your Option? ", CC.GREEN, CC.BLUE, CC.RED, CC.RESET);
            level = scan.nextInt();

            if (level == 1) {
                System.out.println(CC.GREEN+"\n ----{ EASY Level 😀 }----");
                numberGuesses = 15;
                target = 25;
            } else if (level == 2) {
                System.out.println(CC.BLUE+"\n ----{ Normal Level  🤓 }----");
                numberGuesses = 10;
                target = 50;
            } else {
                System.out.println(CC.RED+"\n ----{ Hard Level  😈 }---- ");
                numberGuesses = 5;
                target = 100;
            }
            int number = random.nextInt(target) + 1;
            int guessesRemaining = numberGuesses;

            for (int i = 0; i < numberGuesses; i++) {
                System.out.print(CC.BLUE_BOLD+" \n> Guess a number between 1 and " + target + ": "+ CC.RESET);
                int guess = scan.nextInt();
                if (guess == number) {
                    System.out.println(CC.GREEN_BOLD+" You won! The target number was " + number+ CC.RESET);
                    break;
                } else if (guess < number) {
                    System.out.println(CC.YELLOW_BOLD+"\n The Number \"" + guess + "\" is "+ CC.GREEN_BRIGHT+"Too low. "+ CC.RESET);
                } else {
                    System.out.println(CC.YELLOW_BOLD+"\n The Number \"" + guess + "\" is "+ CC.RED_BRIGHT+"Too high."+ CC.RESET);
                }
                guessesRemaining--;
                System.out.print(CC.RED_BOLD+"\n" + guessesRemaining + " guesses left"+ CC.RESET);

                if (guessesRemaining == 0) {
                    System.out.println(CC.GREEN_BOLD+"\nThe Correct Number was \""+number+"\""+ CC.RESET);
                    System.out.println(CC.RED+"\n\nYou Failed 💣"+ CC.RESET);
                    int j = 5;
                    try {
                        while (j > 0) {
                            System.out.println(CC.RED+j + "...");
                            Thread.sleep(1000);
                            j--;
                        }
                    } catch (InterruptedException e) {
                        System.out.println("CountDown Interrupted!");
                    }
                    System.out.println(CC.RED_BOLD_BRIGHT+"You Died! couldn't save the World!"+ CC.RESET);
                }
            }
            While.again();
        }
    }

}