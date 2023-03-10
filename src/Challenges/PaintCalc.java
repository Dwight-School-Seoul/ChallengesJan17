package Challenges;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PaintCalc {

    public static void main(){

        DecimalFormat df = new DecimalFormat("#.###");
        Scanner paintScanner = new Scanner(System.in);
        System.out.println("\n   ---> The Area of the Rectangular <---    ");
        double areaLength, areaWidth,exactNumberGallon;

        while(true) {
            while(true){
                System.out.print("\n > What is the length of the room in feet? ");
                if (paintScanner.hasNextDouble()) {
                    areaLength = paintScanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                }
            }
            while(true){
                System.out.print("\n > What is the width of the room in feet? ");
                if (paintScanner.hasNextDouble()) {
                    areaWidth = paintScanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");

                }
            }

            System.out.println("\n    > You entered dimensions of " + areaLength + " feet by " + areaWidth + " feet.");

            double areaFeetSq = areaLength * areaWidth;

            System.out.println("\n    > The area of the room is " + areaFeetSq + " feet square.");

            exactNumberGallon = areaFeetSq / 350.0;
            int numberGallonNeeded = (int) Math.ceil(exactNumberGallon);

            System.out.println("\n> You will need to purchase " + df.format(numberGallonNeeded) + " paint to cover " + df.format(areaFeetSq) + " feet square.");

            While.again();

        }
    }

}
