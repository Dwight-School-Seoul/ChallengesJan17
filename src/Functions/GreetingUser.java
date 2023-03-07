package Functions;

import java.util.Scanner;

public class GreetingUser {
    public static void main(){

        Scanner newScanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String yourName = newScanner.nextLine();
        System.out.println("Hello "+ yourName+ ", Nice to meed you " + yourName + "!");

    }

}
