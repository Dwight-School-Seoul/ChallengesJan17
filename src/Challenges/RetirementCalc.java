package Challenges;

import java.util.Scanner;
import Main.*;

public class RetirementCalc {

    public static void main(){
        Scanner retirementScanner = new Scanner(System.in);
        while (true) {
            System.out.print("\n> What is your current age? ");
            int currentAge = retirementScanner.nextInt();
            System.out.print("\n> At what age would you like to retire? ");
            int retirementAge = retirementScanner.nextInt();
            int yearsLeft = retirementAge - currentAge;
            if (yearsLeft > 0) {
                System.out.println("\n> You have " + yearsLeft + " years left until you can retire.");
                System.out.println("> You birth year is "+(2022 - currentAge)+" so you can retire in "+(2022 + yearsLeft));
            } else {
                System.out.println("You can already retire.");
            }
            While.again();

        }
    }


}
