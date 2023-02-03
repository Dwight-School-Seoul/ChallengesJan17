import java.util.Scanner;

public class TemperatureConverter {

    public static void temperatureConverter(){
        Scanner temperatureConvScanner = new Scanner(System.in);

        while(true){
            System.out.print("\nPress C to convert from Fahrenheit to Celsius. Press F to convert from Celsius to Fahrenheit. \nYour choice: ");
            char convertType = temperatureConvScanner.next().toLowerCase().strip().trim().charAt(0);
            System.out.print("Please enter the temperature: ");
            double temperature = temperatureConvScanner.nextDouble();

            if (convertType == 'c') {
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("The temperature in Celsius is " + celsius + ".");
            } else if (convertType == 'f') {
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("The temperature in Fahrenheit is " + fahrenheit + ".");
            } else {
                System.out.println("Invalid input.");
            }
            While.again();
        }
    }

}
