package Project1;

import java.io.*;

class Account {
     int accountNumber;
     static double balance;
     String ownerName;

    public Account(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        balance += amount;
//        updateAccount();
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
//            updateAccount();
            return true;
        } else {
            return false;
        }
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

//    void updateAccount() {
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("src/Project1/BankAccount.csv"));
//            String line = reader.readLine();
//            StringBuffer inputBuffer = new StringBuffer();
//            while (line != null) {
//                String[] data = line.split(",");
//                if (Integer.parseInt(data[0]) == accountNumber) {
//                    data[1] = Double.toString(balance);
//                }
//                inputBuffer.append(String.join(",", data) + "\n");
//                line = reader.readLine();
//            }
//            reader.close();
//            FileOutputStream fileOut = new FileOutputStream("src/Project1/BankAccount.csv");
//            fileOut.write(inputBuffer.toString().getBytes());
//            fileOut.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}