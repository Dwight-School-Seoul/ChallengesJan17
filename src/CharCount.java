import java.util.Scanner;

public class CharCount {

    public static void charCount(){

        Scanner anotherScanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.print("\n > Enter a string: ");
            String inputString = anotherScanner.nextLine();
            if (!inputString.isEmpty()) {
                System.out.println("\n >  Your string is:  "+ inputString +", The number of characters in the string is: " + inputString.length());
                System.out.print("\n > Do you want to enter another string? (yes/no): ");
                String userInput = anotherScanner.nextLine();
                if (userInput.equalsIgnoreCase("no")) {
                    continueLoop = false;
                }
            } else {
                System.out.println(" \n> You must enter something into the program.");
            }
        }
        System.out.println(" \n> Quiting");
    }


}
