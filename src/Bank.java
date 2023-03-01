import java.util.Scanner;

public class Bank {

    private int balance = 0;
    private final String name;
    private int amount;
    private final int age;


    public Bank(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(ConsoleColors.YELLOW_BRIGHT+"\nSetting up Your bank account.");
    }

    public void accountInfo(){
        System.out.println("\nAccount Info:");
        System.out.println(ConsoleColors.RESET+"\tName: " + name);
        System.out.println("\tAge: " + age);
    }

    public void ShowBalance(){
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"\nYour Bank Account Balance is: $"+balance);
    }

    public void withdraw(int amount){
        this.amount = amount;
        if(balance >= amount){
            balance -=amount;
            System.out.printf( ConsoleColors.YELLOW_BOLD_BRIGHT+ "\nYou have successfully withdraw %s$%s%s from your account.\n",ConsoleColors.GREEN_BOLD_BRIGHT, amount, ConsoleColors.YELLOW_BOLD_BRIGHT);
        } else{
            System.out.printf(ConsoleColors.RED_BOLD_BRIGHT+ "\nYou dont have enough money in your Bank Account to withdraw %s$%s. \n", ConsoleColors.GREEN_BOLD_BRIGHT,amount);
        }
    }

    public void deposit(int amount){
        this.amount = amount;
        balance += amount;
        System.out.printf(ConsoleColors.YELLOW_BOLD_BRIGHT+"\nYou have successfully deposit%s $%s %sin your account.\n",ConsoleColors.GREEN_BOLD_BRIGHT, amount, ConsoleColors.YELLOW_BOLD_BRIGHT);
    }

    public static void bankHelp(){
        System.out.println(ConsoleColors.RESET+"\nCommands that you can use:");
        System.out.println(ConsoleColors.RESET+"\t> Info - To show your account information\n\t> Balance - To show your account balance\n\t> Withdraw - To withdraw from you account \n\t> Deposit - To deposit to your account \n\t> help - To show this list \n\t> Quit - to quit the program");

    }

    public static void theBank(){

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

        while(!quit){
            System.out.print(ConsoleColors.PURPLE_BOLD_BRIGHT+"\n\t> Command: "+ConsoleColors.RESET);
            String option = scan.next().trim().toLowerCase().strip();

            switch (option) {
                case "info" -> newBank.accountInfo();
                case "balance" -> newBank.ShowBalance();
                case "withdraw" -> {
                    System.out.print("Enter Withdraw Amount: $");
                    amount = scan.nextInt();
                    newBank.withdraw(amount);
                }
                case "deposit" -> {
                    System.out.print("Enter Deposit Amount: $");
                    amount = scan.nextInt();
                    newBank.deposit(amount);
                }
                case "help" -> Bank.bankHelp();
                case "quit", "no" -> {
                    System.out.println("Quitting the program");
                    quit = true;
                }
                default ->
                        System.out.printf(ConsoleColors.RED_BOLD_BRIGHT + "Unknown command \"%s\"" + ConsoleColors.RESET, option);
            }
        }
    }

} // main
