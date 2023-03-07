package Functions;

import java.util.Random;
import java.util.Scanner;

public class While {

    public static void again() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT + "\n\n ⚪️ Try Again? < Yes / No > ");
            String Option = scanner.next().toLowerCase().trim().strip();
            if (Option.equals("yes")) {
                break;
            } else if (Option.equals("no")) {
                System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "\n 🎣 Quitting");
                System.exit(0);
            } else {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " ⛔️ Error - \"" + Option + "\" Not Fount! ");
            }
        }
    }

    public static String getRandom(String[] input) {
        Random rand = new Random();
        return input[rand.nextInt(input.length)];
    }

    public static String getStringScanOnly(Scanner scan) {
        String input = scan.nextLine();
        while (!input.matches("^[a-zA-Z]+$")) {
            System.out.print(ConsoleColors.RED_BOLD_BRIGHT + "\n ⛔️ Invalid Input, Must Only Contain Alphabetical Characters Only," + ConsoleColors.YELLOW_BRIGHT + " Try Again!: ");
            input = scan.nextLine();
        }
        return input;
    }

    public static int getIntegerScanOnly(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.print(ConsoleColors.RED_BOLD_BRIGHT + "\n ⛔️ Invalid Input, Must Be Numbers," + ConsoleColors.YELLOW_BRIGHT + " Try Again!: ");
            scan.next();
        }
        return scan.nextInt();
    }

    public static void randomizeString(char[] input) {
        Random random = new Random();

        for (int i = input.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            char temp = input[index];
            input[index] = input[i];
            input[i] = temp;
        }
    }

     /*System.out.print("\nEnter a word for another player to guess: ");

        String input = Functions.While.getStringScanOnly(scan);
        char[] originalWord = input.toCharArray();

        randomizeString(originalWord);
        String output = new String(originalWord);*/


    public static String encrypt(String message, int key) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedCharacter = (char) (((character - 'a' + key) % 26) + 'a');
                result.append(shiftedCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String decrypt(String message, int key) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedCharacter = (char) (((character - 'a' - key + 26) % 26) + 'a');
                result.append(shiftedCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

}