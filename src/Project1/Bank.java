package Project1;

import java.util.*;
import java.io.*;

public class Bank {
    private String name;
    private static List<Account> accounts;
    private static final String FILE_NAME = "src/Project1/BankAccount.csv";

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public static void removeAccount(Account account) {
        accounts.remove(account);
    }

    public static Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }


    public static void saveAccount(Account account) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            String data = account.getAccountNumber() + "," + account.getBalance() + "," + account.getOwnerName();
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadAccounts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                int accountNumber = Integer.parseInt(fields[0]);
                double balance = Double.parseDouble(fields[1]);
                String ownerName = fields[2];
                Account account = new Account(accountNumber, balance, ownerName);
                accounts.add(account);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}