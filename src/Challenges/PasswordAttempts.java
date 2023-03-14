package Challenges;

import java.util.Scanner;
import Main.*;

public class PasswordAttempts {


    public static void main(){

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.print(ConsoleColors.YELLOW_BRIGHT + "\n 🔑 Creat a passcode Number: ");
            int passcode = getInt(scan);
            int guess = 3;

            while (guess!=0) {
                System.out.print(ConsoleColors.YELLOW_BRIGHT + "\n 🔒 Rewrite you passcode: ");
                int input = getInt(scan);
                if (input != passcode) {
                    guess--;
                    if (guess == 0) {
                        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "\n ❌ The Passcode Doesn't Match!");
                    } else {
                        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "\n ⚠️ Error, The Passcode Doesn't Match! Try Again");
                    }
                } else {
                    System.out.println(ConsoleColors.GREEN_BRIGHT + "\n 🔓 You passed the security check");
                    break;
                }
            } // while

            if (guess != 0) {
                System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "\n ✅ You Grant Access To The Account");
                System.out.println(ConsoleColors.CYAN+"\nHere are Your Files \n\t > Top Secret Folder \n\t > School Project Folder \n\t > All  OF My Passwords.txt");

            } else {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "\n ⚰️ Your account is locked! ");
            }
            While.again();
        }
     } //password


    private static int getInt(Scanner scan){
        while (!scan.hasNextInt()){
            System.out.print(ConsoleColors.RED_BOLD_BRIGHT+"\n ⛔️ Invalid, the Passcode Must Be a Numbers\n"+ ConsoleColors.YELLOW_BRIGHT + "\n 🔒Try Again! : ");
            scan.next();
        }
        return scan.nextInt();
    } // getInt

} // Main.Main
