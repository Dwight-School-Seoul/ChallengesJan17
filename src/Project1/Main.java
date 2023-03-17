package Project1;

import java.util.*;
import Main.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.printf(CC.YELLOW_BOLD_BRIGHT+"""
                    
                    Bank Account Manager
                        1. Create a new account
                        2. View an existing account
                        3. Deposit funds into an account
                        4. Withdraw funds from an account
                        5. Remove an account
                        6. View all accounts
                        0. Exit
                        %s
                    Enter your choice: \s"""+CC.RESET,CC.PURPLE_BOLD_BRIGHT);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter account number: ");
                    int accountNumber = While.getIntegerScanOnly(scanner);
                    System.out.print("Enter balance: ");
                    double balance = While.getDoubleScanOnly(scanner);
                    scanner.nextLine();
                    System.out.print("Enter owner name: "+CC.RESET);
                    String ownerName = While.getStringScanOnly(scanner);
                    System.out.printf(CC.YELLOW_BOLD_BRIGHT+"""
                        
                        Enter account type
                            1. Savings
                            2. Checking
                        %s
                        Enter your choice: \s"""+CC.RESET,CC.PURPLE_BOLD_BRIGHT);
                    int accountType = While.getIntegerScanOnly(scanner);

                    if (accountType == 1) {

                        System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter interest rate: "+CC.RESET);
                        double interestRate = While.getDoubleScanOnly(scanner);
                        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, balance, ownerName, interestRate);
                        bank.addAccount(savingsAccount);
                        System.out.println(CC.GREEN_BOLD_BRIGHT+"\nSavings account created successfully"+CC.RESET);

                    } else if (accountType == 2) {

                        System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter overdraft limit: "+CC.RESET);
                        double overdraftLimit =  While.getDoubleScanOnly(scanner);
                        CheckingAccount checkingAccount = new CheckingAccount(accountNumber, balance, ownerName, overdraftLimit);
                        bank.addAccount(checkingAccount);
                        System.out.println(CC.GREEN_BOLD_BRIGHT+"\nSavings account created successfully"+CC.RESET);

                    } else {
                        System.out.println(CC.RED_BOLD_BRIGHT+"\nInvalid account type" + CC.RESET);
                    }
                    break;

                case 2:
                    System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter account number: "+CC.RESET);
                    accountNumber = While.getIntegerScanOnly(scanner);
                    Account account = bank.getAccount(accountNumber);

                    if (account == null) {
                        System.out.print(CC.RED_BOLD_BRIGHT+"\nAccount not found"+CC.RESET);
                    } else {
                        System.out.println(CC.CYAN_BOLD_BRIGHT+"\nAccount details:\n\tAccount number: " + account.getAccountNumber() + "\n\tBalance: " + account.getBalance() + "\n\tOwner name: " + account.getOwnerName());
                        if (account instanceof SavingsAccount) {
                            System.out.println("\nAccount type: Savings\n\tInterest rate: " + ((SavingsAccount) account).getInterestRate()+ CC.RESET);
                        } else if (account instanceof CheckingAccount) {
                            System.out.println("\nAccount type: Checking\n\tOverdraft limit: " + ((CheckingAccount) account).getOverdraftLimit()+ CC.RESET);
                        }
                    }
                    break;

                case 3:

                    System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter account number: ");
                    accountNumber = While.getIntegerScanOnly(scanner);
                    account = bank.getAccount(accountNumber);

                    if (account == null) {
                        System.out.println(CC.RED_BOLD_BRIGHT+"\nAccount not found");
                    } else {
                        System.out.print(CC.YELLOW_BOLD_BRIGHT+"Enter deposit amount: ");
                        double depositAmount = While.getDoubleScanOnly(scanner);
                        account.deposit(depositAmount);
                        System.out.print(CC.GREEN_BOLD_BRIGHT+"Deposit successful. New balance: " + account.getBalance()+CC.RESET);
                    }

                    break;

                case 4:

                    System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter account number: ");
                    accountNumber = While.getIntegerScanOnly(scanner);
                    account = bank.getAccount(accountNumber);

                    if (account == null) {
                        System.out.println(CC.RED_BOLD_BRIGHT+"Account not found"+CC.RESET);
                    } else {
                        System.out.println(CC.CYAN_BOLD_BRIGHT+"\n\tAccount number: " + account.getAccountNumber() + "\n\tBalance: " + account.getBalance() + "\n\tOwner name: " + account.getOwnerName());

                        if (account instanceof SavingsAccount) {
                            System.out.println("\nAccount type: Savings\n\tInterest rate: " + ((SavingsAccount) account).getInterestRate()+CC.RESET);
                        } else if (account instanceof CheckingAccount) {
                            System.out.println("\nAccount type: Checking\n\tOverdraft limit: " + ((CheckingAccount) account).getOverdraftLimit()+CC.RESET);
                        }

                        System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter amount to withdraw: "+CC.RESET);
                        double amount = While.getDoubleScanOnly(scanner);

                        if (account.getBalance() < amount) {
                            System.out.print(CC.RED_BOLD_BRIGHT+"\nInsufficient balance"+CC.RESET);
                        } else {
                            account.withdraw(amount);
                            System.out.print(CC.GREEN_BOLD_BRIGHT+"\nWithdrawal successful. New balance: " + account.getBalance()+CC.RESET);
                        }
                    }
                    break;

                case 5:
                    System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter account number: "+CC.RESET);
                     accountNumber = While.getIntegerScanOnly(scanner);
                     account = bank.getAccount(accountNumber);

                    if (account == null) {
                        System.out.println(CC.RED_BOLD_BRIGHT+"Account not found"+CC.RESET);
                    } else {
                        System.out.println(CC.GREEN_BOLD_BRIGHT+"Account removed successfully"+CC.RESET);
                    }
                    break;

                case 6:
                    System.out.println(CC.CYAN_BOLD_BRIGHT+"All accounts:");
                    for (Account a : bank.getAllAccounts()) {
                        System.out.println("Account number: " + a.getAccountNumber() + "\n\tBalance: " + a.getBalance() + "\n\tOwner name: " + a.getOwnerName());
                        if (a instanceof SavingsAccount) {
                            System.out.println("\nAccount type: Savings\n\tInterest rate: " + ((SavingsAccount) a).getInterestRate()+CC.RESET);
                        } else if (a instanceof CheckingAccount) {
                            System.out.println("\nAccount type: Checking\n\tOverdraft limit: " + ((CheckingAccount) a).getOverdraftLimit()+CC.RESET);
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println(CC.RED_BOLD_BRIGHT+"Exiting program..."+CC.RESET);
                    break;

                default:
                    System.out.println(CC.RED_BOLD_BRIGHT+"Invalid choice. Please try again."+CC.RESET);
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
