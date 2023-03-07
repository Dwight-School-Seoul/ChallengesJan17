package Functions;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void magic8ball(){
        System.out.println("\n        ----{ Magic8ball }----        ");
        Scanner playScanner = new Scanner(System.in);

        while (true) {

            Random ran = new Random();
            int x = ran.nextInt(20);
            System.out.println("\nType Your Question Here... ");
            playScanner.nextLine();

            if (x==0) {
                System.out.println("Functions.Magic8Ball ->  It is certain");
            } else if (x == 1) {
                System.out.println("Functions.Magic8Ball -> It is decidedly so");
            } else if (x == 2) {
                System.out.println("Functions.Magic8Ball -> Without a doubt");
            } else if (x == 3) {
                System.out.println("Functions.Magic8Ball -> Yes definitely");
            } else if (x == 4) {
                System.out.println("Functions.Magic8Ball -> You may rely on it");
            } else if (x == 5) {
                System.out.println("Functions.Magic8Ball -> As I see it, yes");
            } else if (x == 6) {
                System.out.println("Functions.Magic8Ball -> Most likely");
            } else if (x == 7) {
                System.out.println("Functions.Magic8Ball -> Outlook good");
            } else if (x == 8) {
                System.out.println("Functions.Magic8Ball -> Yes");
            } else if (x == 9) {
                System.out.println("Functions.Magic8Ball -> Signs point to yes");
            } else if (x == 10) {
                System.out.println("Functions.Magic8Ball -> Reply hazy, try again");
            } else if (x == 11) {
                System.out.println("Functions.Magic8Ball -> Ask again later");
            } else if (x == 12) {
                System.out.println("Functions.Magic8Ball -> Better not tell you now");
            }  else if (x == 13) {
                System.out.println("Functions.Magic8Ball -> Cannot predict now");
            }  else if (x == 14) {
                System.out.println("Functions.Magic8Ball -> Concentrate and ask again");
            }  else if (x == 15) {
                System.out.println("Functions.Magic8Ball -> Don’t count on it");
            }  else if (x == 16) {
                System.out.println("Functions.Magic8Ball -> My reply is no");
            }  else if (x == 17) {
                System.out.println("Functions.Magic8Ball -> My sources say no");
            }  else if (x == 18) {
                System.out.println("Functions.Magic8Ball -> Outlook not so good");
            }  else {
                System.out.println("Functions.Magic8Ball -> Very doubtful");
            }

            while(true){

                System.out.println();
                System.out.println("Functions.Magic8Ball -> Do You Want To Ask Another question? <yes / no>");
                String option = playScanner.nextLine().trim().toLowerCase().strip();

                if (option.equals("yes")) {
                    break;
                } else if (option.equals("no")) {
                    System.out.println("Functions.Magic8Ball -> OK! Thank You For Playing!");
                    return;
                } else {
                    System.out.println("Functions.Magic8Ball -> Error, i don't understand, '"+option+"'");
                }
            }
        }
    }

    public static void magic8ballV2() {
        System.out.println("\n        ----{ Magic8ball }----        ");
        Scanner playScanner = new Scanner(System.in);

        String[] responses = {
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes definitely",
                "You may rely on it",
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Yes",
                "Signs point to yes",
                "Reply hazy, try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don’t count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"
        };

        while (true) {
            System.out.println("\nType Your Question Here... ");
            playScanner.nextLine();

            int x = (int) (Math.random() * 20);
            System.out.println("Functions.Magic8Ball -> " + responses[x]);

            while (true) {
                System.out.println("\nFunctions.Magic8Ball -> Do you want to ask another question? <yes/no>");
                String option = playScanner.nextLine().toLowerCase().trim().strip();

                if (option.equals("yes")) {
                    break;
                } else if (option.equals("no")) {
                    System.out.println("Functions.Magic8Ball -> OK! Thank you for playing!");
                    return;
                } else {
                    System.out.println("Functions.Magic8Ball -> Error, I don't understand '" + option + "'");
                }
            }
        }
    }

    public static void magic8BallV3(){

        System.out.println("\n        ----{ Magic8ball }----        ");
        Scanner playScanner = new Scanner(System.in);
        Random ran = new Random();

        while (true){
            int x = ran.nextInt(20);
            System.out.println("\nType Your Question Here... ");
            playScanner.nextLine();


            switch (x){
                case 0:
                    System.out.println("Functions.Magic8Ball ->  It is certain");
                    break;
                case 1:
                    System.out.println("Functions.Magic8Ball -> It is decidedly so");
                    break;
                case 2:
                    System.out.println("Functions.Magic8Ball -> Without a doubt");
                    break;
                case 3:
                    System.out.println("Functions.Magic8Ball -> Yes definitely");
                    break;
                case 4:
                    System.out.println("Functions.Magic8Ball -> You may rely on it");
                    break;
                case 5:
                    System.out.println("Functions.Magic8Ball -> As I see it, yes");
                    break;
                case 6:
                    System.out.println("Functions.Magic8Ball -> Most likely");
                    break;
                case 7:
                    System.out.println("Functions.Magic8Ball -> Outlook good");
                    break;
                case 8:
                    System.out.println("Functions.Magic8Ball -> Yes");
                    break;
                case 9:
                    System.out.println("Functions.Magic8Ball -> Signs point to yes");
                    break;
                case 10:
                    System.out.println("Functions.Magic8Ball -> Reply hazy, try again");
                    break;
                case 11:
                    System.out.println("Functions.Magic8Ball -> Ask again later");
                    break;
                case 12:
                    System.out.println("Functions.Magic8Ball -> Better not tell you now");
                    break;
                case 13:
                    System.out.println("Functions.Magic8Ball -> Cannot predict now");
                    break;
                case 14:
                    System.out.println("Functions.Magic8Ball -> Concentrate and ask again");
                    break;
                case 15:
                    System.out.println("Functions.Magic8Ball -> Don’t count on it");
                    break;
                case 16:
                    System.out.println("Functions.Magic8Ball -> My reply is no");
                    break;
                case 17:
                    System.out.println("Functions.Magic8Ball -> My sources say no");
                    break;
                case 18:
                    System.out.println("Functions.Magic8Ball -> Outlook not so good");
                    break;
                case 19:
                    System.out.println("Functions.Magic8Ball -> Very doubtful");
                    break;
            }
            While.again();
        }
    }

}
