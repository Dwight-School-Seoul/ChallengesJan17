package Challenges;

import java.util.Scanner;

public class PrintingQuotes {

    public static void printingQuotes(){

        Scanner quotScanner = new Scanner(System.in);

        while (true){
            System.out.println(" > What is the quot? ");
            String quot = quotScanner.nextLine().trim().strip();
            System.out.println(" > Who said it? ");
            String author = quotScanner.nextLine().trim().strip();
            System.out.println(author + " says, " + '"'+quot+'"');

            While.again();

        }
    }

    public static void printingQuotesV2(){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Enter a quote: ");
            String quote = scanner.nextLine();
            if (quote.isEmpty()) {
                System.out.println("Error: Quote cannot be empty. Please enter a quote.");
                continue;
            }
            System.out.print("Enter the author of the quote: ");
            String author = scanner.nextLine();
            if (author.isEmpty()) {
                System.out.println("Error: Author cannot be empty. Please Try Again!");
                continue;
            }
            System.out.println("\"" + quote + "\"" + " -" + author);
            System.out.print("Do you want to quit the program? (y/n) ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                run = false;
            }
        }
        System.out.println("Program terminated.");
    }

}
