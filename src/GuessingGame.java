import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void guessingGame(){

        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int level, target, numberGuesses;

        while (true) {
            System.out.println("\n\n------> Welcome to my Guessing Game <------");
            System.out.print(
                    " \n > Enter a level \n      \"1\" for Easy \n      \"2\" for Medium \n      \"3\" for Hard \n\n > What is your Option? ");
            level = scan.nextInt();

            if (level == 1) {
                System.out.println("\n ----{ EASY Level 😀 }----");
                numberGuesses = 15;
                target = 10;
            } else if (level == 2) {
                System.out.println("\n ----{ Normal Level  🤓 }----");
                numberGuesses = 10;
                target = 50;
            } else {
                System.out.println("\n ----{ Hard Level  😈 }---- ");
                numberGuesses = 5;
                target = 100;
            }
            int number = r.nextInt(target) + 1;
            int guessesRemaining = numberGuesses;

            for (int i = 0; i < numberGuesses; i++) {
                System.out.print(" \n> Guess a number between 1 and " + target + ": ");
                int guess = scan.nextInt();
                if (guess == number) {
                    System.out.println(" You won! The target number was " + number);
                    break;
                } else if (guess < number) {
                    System.out.println("\n The Number \"" + guess + "\" is Too low. ");
                } else {
                    System.out.println("\n The Number \"" + guess + "\" is Too high.");
                }
                guessesRemaining--;
                System.out.print("\n" + guessesRemaining + " guesses left");

                if (guessesRemaining == 0) {
                    System.out.println("\nThe Correct Number was \""+number+"\"");
                    System.out.println("\n\nYou Failed 💣");
                    int j = 5;
                    try {
                        while (j > 0) {
                            System.out.println(j + "...");
                            Thread.sleep(1000);
                            j--;
                        }
                    } catch (InterruptedException e) {
                        System.out.println("CountDown Interrupted!");
                    }
                }
            }
            While.again();
        }
    }
}