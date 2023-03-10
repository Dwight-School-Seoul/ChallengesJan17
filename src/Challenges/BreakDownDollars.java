package Challenges;

import java.util.Scanner;

public class BreakDownDollars {

    public static void main(){

        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.print("\nEnter amount in dollars: ");
            int amount = scan.nextInt();

            int twenties = amount / 20;
            amount = amount % 20;
            int tens = amount / 10;
            amount = amount % 10;
            int fives = amount / 5;
            amount = amount % 5;
            int ones = amount;

            System.out.printf("\n Twenties: %d \n Tens: %d \n Fives: %d \n Ones: %d\n",twenties,tens,fives,ones);

            While.again();

        }
    }

}
