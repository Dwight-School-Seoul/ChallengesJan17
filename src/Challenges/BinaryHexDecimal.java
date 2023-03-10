package Challenges;

import java.util.Scanner;

public class BinaryHexDecimal {

    public static void main(){
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.print("""

                Menu:\s
                \t1. Convert Decimal To Binary.\s
                \t2. Convert Decimal To Hexadecimal.
                \t3. Convert Binary To Decimal.\s
                \t4. Convert Binary To Hexadecimal.
                \t5. Convert Hexadecimal to Decimal.\s
                \t6. Convert Hexadecimal To Binary.
                \t7. Quit

                > Enter Option:\s""");

            String option = scan.next();
            int decimal;
            String hex;
            String binary;

            switch (option) {
                case "1" -> {
                    System.out.print("\nDecimal To Binary: ");
                    decimal = scan.nextInt();
                    System.out.println("The Decimal Value to Binary is: " + Integer.toBinaryString(decimal));
                }
                case "2" -> {
                    System.out.print("\nDecimal To Hexadecimal: ");
                    decimal = scan.nextInt();
                    System.out.println("The Decimal Value to Hexadecimal is: " + Integer.toHexString(decimal));
                }
                case "3" -> {
                    System.out.print("\n Binary To Decimal: ");
                    binary = scan.next();
                    System.out.println("The Binary Value to Decimal is: " + Integer.parseInt(binary, 2));
                }
                case "4" -> {
                    System.out.print("\n Binary To Hexadecimal: ");
                    binary = scan.next();
                    System.out.println("The Binary Value to Hexadecimal is: " +  Integer.toHexString(Integer.parseInt(binary, 2)));
                }
                case "5" -> {
                    System.out.print("\nHexadecimal to Decimal: ");
                    hex = scan.next();
                    System.out.println("The Hexadecimal Value to Decimal is: " + Integer.parseInt(hex, 16));
                }
                case "6" -> {
                    System.out.print("\nHexadecimal to Binary: ");
                    hex = scan.next();
                    System.out.println("The Hexadecimal Value to Binary is: " + Integer.toBinaryString(Integer.parseInt(hex, 16)));
                }
                case "7" -> {
                    System.out.println("\n\nQuitting!\n");
                    return;
                }
                default -> System.out.println("\nInvalid - option \"" + option + "\" Not Found! ");
            }
        }
    }
}
