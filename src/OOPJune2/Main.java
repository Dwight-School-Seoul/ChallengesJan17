package OOPJune2;
import Main.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        System.out.printf(CC.BLUE_BOLD_BRIGHT+"""
                        
                        
                        ---------------------------------
                             June 2nd - OOP WorkSheet
                        ---------------------------------
                        %s
                            Main menu:
                                1. Array Search
                                2. Array Sum
                                3. Calculate Average
                                4. Character Check
                                5. Count vowels ans consonants
                                5. Fibonacci Series
                                6. Prime Number Checker
                                7. Rectangle
                                8. Reverse String
                                9. Word Count
                               10. Help
                           """, CC.RESET);


        while (true) {
            System.out.print(CC.PURPLE_BOLD_BRIGHT + "\n > Enter Option: " + CC.RESET);
            int option = While.getIntegerScanOnly(scan);

            switch (option) {
                case 1 -> ArraySearch.main();
                case 2 -> ArraySum.main();
                case 3 -> CalculateAverage.main();
                case 4 -> CharacterCheck.main();
                case 5 -> CountVowelsAndConsonants.main();
                case 6 -> PrimeNumberChecker.main();
                case 7 -> Rectangle.main();
                case 8 -> ReverseString.main();
                case 9 -> WordCount.main();
                case 10 -> help();
                default -> System.out.printf(CC.RED_BOLD_BRIGHT + "\nError option \"%s\" not found", option);
            }
        }
    }

    private static void help(){
        System.out.printf(CC.BLUE_BOLD_BRIGHT+"""


                ---------------------------------
                     June 2nd - OOP WorkSheet
                ---------------------------------
                %s
                    Main menu:
                        1. Array Search - To search  a specific element in an array.
                        2. Array Sum - To calculates the sum of all elements in an array of integers.
                        3. Calculate Average - To calculates the average of an array of numbers.
                        4. Character Check - To check if a specific Character in a word.
                        5. Count vowels ans consonants - To counts the number of vowels and consonants in the string.
                        5. Fibonacci Series - To generates the Fibonacci series up to a specified number of terms.
                        6. Prime Number Checker - To check if the number is Prime.
                        7. Rectangle - To calculate the area and perimeter of the rectangle
                        8. Reverse String - To reverses the order of the characters in the string.
                        9. Word Count - To counts the number of words in the sentence.
                       10. Help - To show this menu.
                   """,CC.RESET);
    }
}
