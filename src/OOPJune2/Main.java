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
                                6. Fibonacci Series
                                7. Leap Year
                                8. Prime Number Checker
                                9. Rectangle
                               10. Reverse String
                               11. Word Count
                               12. Help
                               13. Quit
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
                case 6 -> FibonacciSeries.main();
                case 7 -> LeapYear.main();
                case 8 -> PrimeNumberChecker.main();
                case 9 -> Rectangle.main();
                case 10 -> ReverseString.main();
                case 11 -> WordCount.main();
                case 12 -> help();
                case 13 -> {
                    System.out.println(CC.CYAN_BOLD_BRIGHT + "\n 🎣 Quitting");
                    return;
                }
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
                    Main menu:ً
                        1. Array Search - To search  a specific element in an array.
                        2. Array Sum - To search a specific element in an array.
                        3. Calculate Average - To calculates the average of an array of numbers.
                        4. Character Check - To check if a specific Character in a word.
                        5. Count vowels ans consonants - To counts the number of vowels and consonants in the string.
                        6. Fibonacci Series - To generates the Fibonacci series up to a specified number of terms.
                        7. Leap Year - To checks if a given year is a leap year.
                        8. Prime Number Checker - To check if the number is Prime.
                        9. Rectangle - To calculate the area and perimeter of the rectangle
                       10. Reverse String - To reverses the order of the characters in the string.
                       11. Word Count - To counts the number of words in the sentence.
                       12. Help - To show this menu.
                       13. Quit - To Exit the program.
                   """,CC.RESET);
    }
}
