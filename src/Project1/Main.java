package Project1;

import java.util.*;
import Main.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("""
                    
                    Bank Account Manager
                        1. Create a new account
                        2. View an existing account
                        3. Deposit funds into an account
                        4. Withdraw funds from an account
                        5. Remove an account
                        6. View all accounts
                        0. Exit
                        
                    Enter your choice:""");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter account number: ");
                    int accountNumber = While.getIntegerScanOnly(scanner);
                    System.out.print("\nEnter balance: ");
                    double balance = While.getDoubleScanOnly(scanner);
                    scanner.nextLine();
                    System.out.print("\nEnter owner name: ");
                    String ownerName = While.getStringScanOnly(scanner);
                    System.out.print("""
                        
                        Enter account type
                            1. Savings
                            2. Checking
                        
                          Enter your choice:""");
                    int accountType = While.getIntegerScanOnly(scanner);

                    if (accountType == 1) {

                        System.out.print("\nEnter interest rate:");
                        double interestRate = While.getDoubleScanOnly(scanner);
                        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, balance, ownerName, interestRate);
                        bank.addAccount(savingsAccount);
                        System.out.println("\nSavings account created successfully");

                    } else if (accountType == 2) {

                        System.out.print("\nEnter overdraft limit:");
                        double overdraftLimit =  While.getDoubleScanOnly(scanner);
                        CheckingAccount checkingAccount = new CheckingAccount(accountNumber, balance, ownerName, overdraftLimit);
                        bank.addAccount(checkingAccount);
                        System.out.print("\nChecking account created successfully");

                    } else {
                        System.out.println("Invalid account type");
                    }
                    break;

                case 2:
                    System.out.print("\nEnter account number:");
                    accountNumber = While.getIntegerScanOnly(scanner);
                    Account account = bank.getAccount(accountNumber);

                    if (account == null) {
                        System.out.print("\nAccount not found");
                    } else {
                        System.out.println("Account details:\nAccount number: " + account.getAccountNumber() + "\nBalance: " + account.getBalance() + "\nOwner name: " + account.getOwnerName());
                        if (account instanceof SavingsAccount) {
                            System.out.println("Account type: Savings\nInterest rate: " + ((SavingsAccount) account).getInterestRate());
                        } else if (account instanceof CheckingAccount) {
                            System.out.println("Account type: Checking\nOverdraft limit: " + ((CheckingAccount) account).getOverdraftLimit());
                        }
                    }
                    break;

                case 3:

                    System.out.print("\nEnter account number:");
                    accountNumber = While.getIntegerScanOnly(scanner);
                    account = bank.getAccount(accountNumber);

                    if (account == null) {
                        System.out.println("Account not found");
                    } else {
                        System.out.println("Enter deposit amount:");
                        double depositAmount = While.getDoubleScanOnly(scanner);
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful. New balance: " + account.getBalance());
                    }

                    break;

                case 4:

                    System.out.print("\nEnter account number:");
                    accountNumber = While.getIntegerScanOnly(scanner);
                    account = bank.getAccount(accountNumber);

                    if (account == null) {
                        System.out.println("Account not found");
                    } else {
                        System.out.println("\nAccount number: " + account.getAccountNumber() + "\nBalance: " + account.getBalance() + "\nOwner name: " + account.getOwnerName());

                        if (account instanceof SavingsAccount) {
                            System.out.println("\nAccount type: Savings\nInterest rate: " + ((SavingsAccount) account).getInterestRate());
                        } else if (account instanceof CheckingAccount) {
                            System.out.println("\nAccount type: Checking\nOverdraft limit: " + ((CheckingAccount) account).getOverdraftLimit());
                        }

                        System.out.print("\nEnter amount to withdraw:");
                        double amount = While.getDoubleScanOnly(scanner);

                        if (account.getBalance() < amount) {
                            System.out.println("\nInsufficient balance");
                        } else {
                            account.withdraw(amount);
                            System.out.println("\nWithdrawal successful. New balance: " + account.getBalance());
                        }
                    }
                    break;

                case 5:
                    System.out.print("\nEnter account number:");
                     accountNumber = While.getIntegerScanOnly(scanner);
                     account = bank.getAccount(accountNumber);

                    if (account == null) {
                        System.out.println("Account not found");
                    } else {
                        System.out.println("Account removed successfully");
                    }
                    break;

                case 6:
                    System.out.println("All accounts:");
                    for (Account a : bank.getAllAccounts()) {
                        System.out.println("Account number: " + a.getAccountNumber() + "\nBalance: " + a.getBalance() + "\nOwner name: " + a.getOwnerName());
                        if (a instanceof SavingsAccount) {
                            System.out.println("Account type: Savings\nInterest rate: " + ((SavingsAccount) a).getInterestRate());
                        } else if (a instanceof CheckingAccount) {
                            System.out.println("Account type: Checking\nOverdraft limit: " + ((CheckingAccount) a).getOverdraftLimit());
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
}
}
