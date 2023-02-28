import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int amount;
        boolean quit = false;

        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"\n------------{ John's Bank For Foreigners }------------\n");

        System.out.println(ConsoleColors.YELLOW_BRIGHT+"\nCreate a Bank Account");
        System.out.print(ConsoleColors.RESET+"\nEnter your name... ");
        String name = scan.nextLine();
        System.out.print("Enter your Age... ");
        int age = scan.nextInt();

        if(age<=12){
            System.out.println(ConsoleColors.RED_BRIGHT+"You must be 13 years old or older to be able to create a bank account");
            return;
        }

        Bank newBank = new Bank(name , age);

        System.out.println(ConsoleColors.GREEN+"You have Successfully Created a Bank Account ");

        Bank.bankHelp();
        System.out.print(ConsoleColors.RESET+"\nWhat do you want to do today? ");

        while(!quit){
            String option = scan.next().trim().toLowerCase().strip();

            switch (option){
                case "info":
                    newBank.accountInfo();
                    break;
                case "balance":
                    newBank.ShowBalance();
                    break;
                case "withdraw":
                    System.out.print("How much do you want to withdraw? $");
                    amount = scan.nextInt();
                    newBank.withdraw(amount);
                    break;
                case "deposit":
                    System.out.print("How much do you want to deposit? $");
                    amount = scan.nextInt();
                    newBank.deposit(amount);
                    break;
                case "help":
                    Bank.bankHelp();
                    break;
                case "quit", "no":
                    System.out.println("Quitting the program");
                    quit = true;
                    break;
                default:
                    System.out.printf("unknown command \"%s\"", option);
                    break;
            }
            System.out.print(ConsoleColors.RESET+"\n any other? ");

        }

    }
}
