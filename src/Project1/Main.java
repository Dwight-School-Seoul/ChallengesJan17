package Project1;

import java.util.*;
import Main.*;
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.printf("""
                    %sBank Account Manager
                        1. Create a new account"
                        2. View an existing account
                        3. Deposit funds into an account
                        4. Withdraw funds from an account
                        5. Remove an account
                        6. Exit
                        
                    %sEnter your choice (1-6):%s """,CC.YELLOW_BOLD_BRIGHT,CC.PURPLE_BOLD_BRIGHT,CC.RESET);
            int choice = While.getIntegerScanOnly(scanner);
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> viewAccount();
                case 3 -> depositFunds();
                case 4 -> withdrawFunds();
                case 5 -> removeAccount();
                case 6 -> System.exit(0);
                default -> System.out.printf(CC.RED_BOLD_BRIGHT + "Unknown command \"%s\"" + CC.RESET, choice);

            }
            System.out.println();
        }
    }
    private static void createAccount() {
        System.out.print("\nEnter account number: ");
        int accountNumber = While.getIntegerScanOnly(scanner);
        scanner.nextLine();
        System.out.print("Enter owner name: ");
        String ownerName = While.getStringScanOnly(scanner);
        System.out.print("Enter account type (1 for savings, 2 for checking, or any other key for default): ");
        int accountType = While.getIntegerScanOnly(scanner);
        scanner.nextLine();
        if (accountType == 1) {
            System.out.print("\nEnter interest rate: ");
            double interestRate = While.getDoubleScanOnly(scanner);
            SavingsAccount account = new SavingsAccount(accountNumber, 100, ownerName, interestRate);

            Bank.addAccount(account);
        } else if (accountType == 2) {
            System.out.print("\nEnter overdraft limit: ");
            double overdraftLimit = While.getDoubleScanOnly(scanner);
            Bank.addAccount(new CheckingAccount(accountNumber, 0, ownerName, overdraftLimit));
        } else {
            Bank.addAccount(new Account(accountNumber, 0, ownerName));
        }
        System.out.println(CC.GREEN_BOLD_BRIGHT+"\nAccount created successfully."+CC.RESET);
    }

    private static void viewAccount() {
        System.out.print("\nEnter account number: ");
        int accountNumber = scanner.nextInt();
        Account account = Bank.getAccount(accountNumber);
        if (account != null) {
            System.out.println("\nAccount details:");
            System.out.printf("\nAccount number: %d\n", account.getAccountNumber());
            System.out.printf("\nOwner name: %s\n", account.getOwnerName());
            System.out.printf("\nBalance: %.2f\n", account.getBalance());
            if (account instanceof SavingsAccount) {
                System.out.printf("\nInterest rate: %.2f%%\n", ((SavingsAccount) account).getInterestRate() * 100);
            } else if (account instanceof CheckingAccount) {
                System.out.printf("\nOverdraft limit: %.2f\n", ((CheckingAccount) account).getOverdraftLimit());
            }
        } else {
            System.out.println(CC.RED_BOLD_BRIGHT+"Account not found."+CC.RESET);
        }
    }

    private static void depositFunds() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        Account account = Bank.getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            Bank.saveAccount(account);
            System.out.printf("%.2f deposited successfully.\n", amount);
        } else {
            System.out.println(CC.RED_BOLD_BRIGHT+"Account not found."+CC.RESET);
        }
    }

    private static void withdrawFunds() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        Account account = Bank.getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            if (account.getBalance() < amount) {
                System.out.println("Insufficient funds.");
            } else {
                account.withdraw(amount);
                Bank.saveAccount(account);
                System.out.printf("%.2f withdrawn successfully.\n", amount);
            }
        } else {
            System.out.println(CC.RED_BOLD_BRIGHT+"Account not found."+CC.RESET);
        }
    }

    private static void removeAccount() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        Account account = Bank.getAccount(accountNumber);
        if (account != null) {
            Bank.removeAccount(account);
            System.out.println(CC.GREEN_BOLD_BRIGHT+"Account removed successfully."+CC.RESET);
        } else {
            System.out.println(CC.RED_BOLD_BRIGHT+"Account not found."+CC.RESET);
        }
    }



}
