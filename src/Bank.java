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
        System.out.println("Your Account Info:");
        System.out.println(ConsoleColors.RESET+"\tName: " + name);
        System.out.println("\tAge: " + age);
    }

    public void ShowBalance(){
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"Your Bank Account Balance is: $"+balance);
    }

    public void withdraw(int amount){
        this.amount = amount;
        if(balance >= amount){
            balance -=amount;
            System.out.printf( ConsoleColors.YELLOW_BOLD_BRIGHT+ "You have successfully withdraw %s$%s%s from your account.",ConsoleColors.GREEN_BOLD_BRIGHT, amount, ConsoleColors.YELLOW_BOLD_BRIGHT);
        } else{
            System.out.printf(ConsoleColors.RED_BOLD_BRIGHT+ "You dont have enough money in your Bank Account to withdraw %s$%s. ", ConsoleColors.GREEN_BOLD_BRIGHT,amount);
        }
    }

    public void deposit(int amount){
        this.amount = amount;
        balance += amount;
        System.out.printf(ConsoleColors.YELLOW_BOLD_BRIGHT+"You have successfully deposit%s $%s %sin your account.",ConsoleColors.GREEN_BOLD_BRIGHT, amount, ConsoleColors.YELLOW_BOLD_BRIGHT);
    }

    public static void bankHelp(){
        System.out.println(ConsoleColors.RESET+"\nCommands that you can use");
        System.out.println(ConsoleColors.RESET+"\n\t> Info - To show your account information\n\t> Balance - To show your account balance\n\t> Withdraw - To withdraw from you account \n\t> Deposit - To deposit to your account \n\t> help - To show this list \n\t> Quit - to quit the program");

    }

    public static void theBank(){


    } // the banker

} // main
