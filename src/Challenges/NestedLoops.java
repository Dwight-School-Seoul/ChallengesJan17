package Challenges;

import java.util.Scanner;
import Main.*;

public class NestedLoops {

    public static void CountDown(){
        Scanner scan = new Scanner(System.in);

        for(int i=10; i>=0;i-- ){
            System.out.println(ConsoleColors.RED_BOLD+i+"...");
        }
        System.out.println(ConsoleColors.RED_BRIGHT+"END...");
    }

    public static void CountDownv2(){

        Scanner scan = new Scanner(System.in);
        System.out.print(ConsoleColors.YELLOW_BRIGHT+"Enter a number for the countdown..");
        int number = scan.nextInt();

        for(int i=number; i>=0; i--){
            System.out.println(ConsoleColors.RED_BOLD+"\t\t"+i+"...");
        }
        System.out.println(ConsoleColors.RED_BRIGHT+"End...");
    }


    public static void ZerosPattern(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i=1; i <= rows; i++) {
            System.out.println(" ".repeat(i-1) + "O");
        }

    }

    public static void TPattern(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows - i));
            System.out.println("T".repeat(2 * i - 1));
        }
    }

    public static void ChristmasTreePattern(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows - i));
            if( i % 2==0){
                System.out.println("-".repeat(2 * i -1 ));

            }else{
                System.out.println("^".repeat(2 * i -1));

            }
        }
    }



}// main
