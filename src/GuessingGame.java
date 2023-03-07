import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(){

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int level, target, numberGuesses;

        while (true) {
            System.out.println(ConsoleColors.BLUE+"\n\n------> Welcome to my Guessing Game <------"+ConsoleColors.RESET);
            System.out.printf(" \n > Enter a level \n\n      %s\"1\" for Easy \n      %s\"2\" for Medium \n      %s\"3\" for Hard \n\n %s> What is your Option? ",ConsoleColors.GREEN,ConsoleColors.BLUE,ConsoleColors.RED,ConsoleColors.RESET);
            level = scan.nextInt();

            if (level == 1) {
                System.out.println(ConsoleColors.GREEN+"\n ----{ EASY Level 😀 }----");
                numberGuesses = 15;
                target = 25;
            } else if (level == 2) {
                System.out.println(ConsoleColors.BLUE+"\n ----{ Normal Level  🤓 }----");
                numberGuesses = 10;
                target = 50;
            } else {
                System.out.println(ConsoleColors.RED+"\n ----{ Hard Level  😈 }---- ");
                numberGuesses = 5;
                target = 100;
            }
            int number = random.nextInt(target) + 1;
            int guessesRemaining = numberGuesses;

            for (int i = 0; i < numberGuesses; i++) {
                System.out.print(ConsoleColors.BLUE_BOLD+" \n> Guess a number between 1 and " + target + ": "+ConsoleColors.RESET);
                int guess = scan.nextInt();
                if (guess == number) {
                    System.out.println(ConsoleColors.GREEN_BOLD+" You won! The target number was " + number+ConsoleColors.RESET);
                    break;
                } else if (guess < number) {
                    System.out.println(ConsoleColors.YELLOW_BOLD+"\n The Number \"" + guess + "\" is "+ConsoleColors.GREEN_BRIGHT+"Too low. "+ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.YELLOW_BOLD+"\n The Number \"" + guess + "\" is "+ConsoleColors.RED_BRIGHT+"Too high."+ConsoleColors.RESET);
                }
                guessesRemaining--;
                System.out.print(ConsoleColors.RED_BOLD+"\n" + guessesRemaining + " guesses left"+ConsoleColors.RESET);

                if (guessesRemaining == 0) {
                    System.out.println(ConsoleColors.GREEN_BOLD+"\nThe Correct Number was \""+number+"\""+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED+"\n\nYou Failed 💣"+ConsoleColors.RESET);
                    int j = 5;
                    try {
                        while (j > 0) {
                            System.out.println(ConsoleColors.RED+j + "...");
                            Thread.sleep(1000);
                            j--;
                        }
                    } catch (InterruptedException e) {
                        System.out.println("CountDown Interrupted!");
                    }
                    System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"You Died! couldn't save the World!"+ConsoleColors.RESET);
                }
            }
            While.again();
        }
    }

}