package Formative_Summative;

import java.util.*;
public class WordScramble {

    public static void main(){


        Scanner scan = new Scanner(System.in);

        System.out.println("\n****** Welcome to Word Scramble *******\n");
        int score = 0;
        boolean quit = false;

        do {
            String[] computerWords = {"this", "have", "from", "one", "had", "word", "but", "not", "what", "all", "were", "when", "your", "can", "said", "there", "use", "each", "which", "she", "how", "their", "will", "other", "about", "out", "many", "then", "them", "these", "some", "her", "would", "make", "like", "him", "into", "time", "has", "look", "two", "more", "write", "see", "number", "way", "could", "people", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come", "made", "may", "part"};

            System.out.print("""

                    Main Menu
                    \t1. Enter a word for another player to guess
                    \t2. Have the computer generate a word for you to guess
                    \t3. Check your score
                    \t4. Quit the game

                    Enter your choice:\s""");

            String option = scan.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.print("\nEnter a word for another player to guess: ");
                    String input = getAlphabet(scan);
                    char[] originalWord = input.toCharArray();
                    scrambleWord(originalWord);
                    String scrambledWord = new String(originalWord);

                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                    System.out.println("\nThe scrambled word is: " + scrambledWord);
                    System.out.println("Game Instructions:\n" +
                            "You have to try to guess what the scrambled word is. You have 3 guesses");

                    for (int i = 0; i < 3; i++) {
                        System.out.print("Enter your guess #" + (i+1) +": ");
                        String guess = scan.nextLine();

                        if (guess.equals(input)) {
                            System.out.println("\nCorrect! You guessed the word.");
                            score += 5;
                            break;

                        } else if (i == 2) {
                            System.out.println("\nSorry, you ran out of guesses. The word was: " + input);
                        } else {
                            System.out.println("\nSorry, that's incorrect. Please try again.");
                        }
                    }

                }
                case "2" -> {
                    String computerWord = getWord(computerWords);
                    char[] word = computerWord.toCharArray();
                    scrambleWord(word);
                    String scrambledComputerWord = new String(word);
                    System.out.println("\nThe scrambled word is: " + scrambledComputerWord);
                    System.out.println("""

                            Game Instructions:
                            You have to try to guess what the scrambled word is. You have 3 guesses
                            """);

                    for (int i = 0; i < 3; i++) {
                        System.out.print("Enter your guess #" + (i+1) +": ");
                        String guess = getAlphabet(scan);

                        if (guess.equals(computerWord)) {
                            System.out.println("\nCorrect! You guessed the word.");
                            score += 5;
                            break;
                        } else if (i == 2) {
                            System.out.println("\nSorry, you ran out of guesses. The word was: " + computerWord);
                        } else {
                            System.out.println("\nSorry, that's incorrect. Please try again.");
                        }
                    }

                }
                case "3" -> System.out.println("\nYour score is: " + score);
                case "4" -> {
                    System.out.println("\nQuitting the game. Thanks for playing!");
                    quit = true;
                }
                default -> System.out.println("\nInvalid option. Please choose again.");
            }

        } while (!quit);
    }

    private static void scrambleWord(char[] word) {
        Random random = new Random();

        for (int i = word.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            char temp = word[index];
            word[index] = word[i];
            word[i] = temp;
        }
    }

    private static String getWord(String[] letters) {
        Random rand = new Random();
        return letters[rand.nextInt(letters.length)];
    }

    public static String getAlphabet(Scanner scan){
        String input = scan.nextLine();
        while (!input.matches("^[a-zA-Z]+$")) {
            System.out.println("\ninvalid - input should only contain alphabetical characters.");
            input = scan.nextLine();
        }
        return input;
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            // handle exception
        }
    }

} // main
