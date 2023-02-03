import java.util.Scanner;

public class PizzaParty {

    public static void pizzaParty(){

        Scanner pizzaScanner = new Scanner(System.in);

        while(true) {
            System.out.print("\n> How may people? ");
            int numberPeople = pizzaScanner.nextInt();

            System.out.print("\n> How many Pizza do you have? ");
            int numberPizza = pizzaScanner.nextInt();

            System.out.print("\n> How many slices per pizza: ");
            int numberSlices = pizzaScanner.nextInt();

            System.out.println("\n> " + numberPeople + " people with " + numberPizza + " pizzas ");

            int totalSlices = numberPizza * numberSlices;
            int slicesPerPerson = totalSlices / numberPeople;
            double pizzaLeft = totalSlices % numberPeople;

            System.out.println("\nEach person gets " + slicesPerPerson + " pieces of pizza.");
            System.out.println("There are " + pizzaLeft + " leftover pieces");

            While.again();

        }
    }

}
