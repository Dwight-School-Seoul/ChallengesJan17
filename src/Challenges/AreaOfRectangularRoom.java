package Challenges;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfRectangularRoom {

    public static void main(){

        DecimalFormat df = new DecimalFormat("#.###");
        Scanner areaScanner = new Scanner(System.in);
        System.out.println("\n   ---> The Area of the Rectangular <---    ");

        while(true) {
            System.out.print("\n > What is the length of the room in feet? ");
            double areaLength = areaScanner.nextDouble();
            System.out.print("\n > What is the width of the room in feet? ");
            double areaWidth = areaScanner.nextDouble();

            System.out.println("\n    > You entered dimensions of " + areaLength + " feet by " + areaWidth + " feet.");

            double areaFeetSq = areaLength * areaWidth;
            double areaMeterSq = areaFeetSq / 10.764;

            System.out.println("\n > The Area of the Rectangular:");
            System.out.println("    > " + df.format(areaFeetSq) + " Square Feet");
            System.out.println("    > " + df.format(areaMeterSq) + " Square Meters");

            While.again();

        }
    }

    public static void areaRectangularRoomV2(){
        double length, width, areaInFeet, areaInMeters;
        final double feetSqToMeterSq = 0.09290304;
        Scanner input = new Scanner(System.in);
        String unit;

        System.out.print("Enter the length of the room: ");
        length = input.nextDouble();
        System.out.print("Enter the unit of measurement (ft or m): ");
        unit = input.next();

        if(unit.equals("ft")) {
            areaInFeet = length;
            areaInMeters = areaInFeet * feetSqToMeterSq;
        }
        else if(unit.equals("m")) {
            areaInMeters = length;
            areaInFeet = areaInMeters / feetSqToMeterSq;
        }
        else {
            System.out.println("Invalid unit of measurement entered.");
            return;
        }

        System.out.print("Enter the width of the room: ");
        width = input.nextDouble();
        System.out.print("Enter the unit of measurement (ft or m): ");
        unit = input.next();

        if(unit.equals("ft")) {
            areaInFeet = areaInFeet * width;
            areaInMeters = areaInFeet * feetSqToMeterSq;
        }
        else if(unit.equals("m")) {
            areaInMeters = areaInMeters * width;
            areaInFeet = areaInMeters / feetSqToMeterSq;
        }
        else {
            System.out.println("Invalid unit of measurement entered.");
            return;
        }
        System.out.printf("The area of the room is %.2f square feet and %.2f square meters.", areaInFeet, areaInMeters);
    }

}
