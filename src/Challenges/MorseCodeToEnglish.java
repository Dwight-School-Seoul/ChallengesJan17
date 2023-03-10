package Challenges;

import java.util.Scanner;

public class MorseCodeToEnglish {

    public static void main() {

        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        String[] code = { ".-", "-...", "-.-.", "-..",  ".", "..-.", "--.", "....", "..", ".---", "-.-",  ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",  "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|" };

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.print("""
                    
                    \nMain Menu:
                    \t1. Convert Morse Code to English Text.
                    \t2. Convert English Text to Morse Code.
                    \t3. Exit
                    
                    Enter Your Option: \s"""
            );

            String option = scan.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.print(ConsoleColors.YELLOW_BRIGHT + "\n> Enter your Morse Code To Convert it into English Text: ");
                    option = get(scan);
                    morseToEnglish(code, option);
                }
                case "2" -> {
                    System.out.print(ConsoleColors.YELLOW_BRIGHT + "\n> Enter your English Text To Convert it into Morse Code: ");
                    option = get(scan);
                    englishToMorse(code, option, letter);
                }
                case "3" -> {
                    System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "\nQuitting!");
                    return;
                }
                default ->
                        System.out.println(ConsoleColors.RED_BRIGHT + "\nError - \"" + option + "\" Not Found!" + ConsoleColors.RESET);
            }
        }
    }

    public static void morseToEnglish(String[] code, String morseCode) {
        String[] array = morseCode.split("\\s+|/");
        System.out.print(ConsoleColors.RESET+"\nMorse code " + morseCode + " to English is ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    System.out.print((char)(j + 'a') + "");
                    break;
                }
            }
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
    }


    public static void englishToMorse(String[] code, String englishLang, char[] letter) {
        System.out.print(ConsoleColors.RESET+"Morse code of " + englishLang + " is ");
        for (int i = 0; i < englishLang.length(); i++) {
            if (englishLang.charAt(i) == ' ') {
                System.out.print(" / ");
            } else {
                for (int j = 0; j < letter.length; j++) {
                    if (englishLang.charAt(i) == letter[j]) {
                        System.out.print(code[j] + " ");
                        break;
                    }
                }
            }
        }
    }

    public static String get(Scanner scan){
        String input = scan.nextLine();
        while (!input.matches("^[a-zA-Z]+$")) {
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"\ninvalid - input should only contain alphabetical characters.");
            input = scan.nextLine();
        }
        return input;
    }
}
