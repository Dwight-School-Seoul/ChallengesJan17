package Challenges;

import java.util.Scanner;

public class SimpleMath {

    public static void main(){
        Scanner simpleMathScanner = new Scanner(System.in);
        boolean SimpleTuition = true;
        while (SimpleTuition) {
            System.out.println("\n> Enter The First Number: ");
            double simpleMathNumberOne = simpleMathScanner.nextDouble();
            System.out.println("\n> Enter The Second Number: ");
            double simpleMAthNumberTwo = simpleMathScanner.nextDouble();

            double sum = simpleMathNumberOne + simpleMAthNumberTwo;
            double difference = simpleMathNumberOne - simpleMAthNumberTwo;
            double product = simpleMathNumberOne * simpleMAthNumberTwo;
            double quotient = simpleMathNumberOne / simpleMAthNumberTwo;

            System.out.println("> Sum: " + sum);
            System.out.println("> Difference: " + difference);
            System.out.println("> Product: " + product);
            System.out.println("> Quotient: " + quotient);

            While.again();

        }
    }


}
