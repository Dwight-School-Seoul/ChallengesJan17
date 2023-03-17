package Project1;

import java.io.*;
public class Account {
    private int accountNumber;
    private double balance;
    private String ownerName;

    public Account(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
