package DataBase;

import java.sql.*;
import java.util.Scanner;
import Main.*;

public class Bank {

    private double balance = 0;
    private final String username;
    private final int age;
    private static final String url="jdbc:mysql://localhost:3306/BankDB";
    private static final String user = "admin";
    private static final String password = "";

    public Bank(String username, int age){
        this.username = username;
        this.age = age;
    }
    public Bank(String username, int age, double balance){
        this.username = username;
        this.age = age;
        this.balance = balance;
    }

    public void accountInfo(){
        System.out.println("\nAccount Info:");
        System.out.println(ConsoleColors.RESET+"\tName: " + username);
        System.out.println("\tAge: " + age);
    }

    public void ShowBalance(){
        System.out.printf(ConsoleColors.GREEN_BOLD_BRIGHT+"\nYour DataBase.Bank Account Balance is: $%.3f\n",balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf(ConsoleColors.YELLOW_BOLD_BRIGHT + "\nYou have successfully withdrawn %s$%.2f%s from your account.\n", ConsoleColors.GREEN_BOLD_BRIGHT, amount, ConsoleColors.YELLOW_BOLD_BRIGHT);

            String sql = "UPDATE UserLogin SET balance = ? WHERE Name = ?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setDouble(1, balance);
                preparedStatement.setString(2, username);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Error updating balance: " + e.getMessage() + ConsoleColors.RESET);
            }
        } else {
            System.out.printf(ConsoleColors.RED_BOLD_BRIGHT + "\nYou don't have enough money in your bank account to withdraw %s$%.3f. \n", ConsoleColors.GREEN_BOLD_BRIGHT, amount);
        }
    }

    public void deposit(double amount) {
        balance += amount;

        String sql = "UPDATE UserLogin SET balance = ? WHERE Name = ?";
        try {
            Connection connections = DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement = connections.prepareStatement(sql);
            preparedStatement.setDouble(1, balance);
            preparedStatement.setString(2, username);
            int rows = preparedStatement.executeUpdate();
            if (rows > 0) {
                System.out.printf(ConsoleColors.YELLOW_BOLD_BRIGHT+"\nYou have successfully deposited %s$%.3f%s in your account.\n", ConsoleColors.GREEN_BOLD_BRIGHT, amount, ConsoleColors.YELLOW_BOLD_BRIGHT);
            }
        }catch (SQLException e){
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Error updating balance: " + e.getMessage() + ConsoleColors.RESET);
        }
    }

    private static void bankHelp(){
        System.out.println(ConsoleColors.RESET+"\nCommands that you can use:");
        System.out.println(ConsoleColors.RESET+"\t> Info - To show your account information" +
                "\n\t> Balance - To show your account balance" +
                "\n\t> Withdraw - To withdraw from you account " +
                "\n\t> Deposit - To deposit to your account " +
                "\n\t> Logout - To log you out from your current account." +
                "\n\t> Help - To show this list " +
                "\n\t> Quit - to quit the program");
    }

    public static void main(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connections = DriverManager.getConnection(url,user,password);
            Statement statement = connections.createStatement();

            Scanner scan = new Scanner(System.in);
            double amount;
            Bank bank;

            System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"\n------------{ John's DataBase.Bank For Foreigners }------------\n"+ ConsoleColors.RESET);

            while(true){
                System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"\n--------{ CSVFilePractice.CSVFilePractice Menu }--------"+ ConsoleColors.RESET);
                System.out.println("\n1. Create a bank account.");
                System.out.println("2. Login to a bank account.");
                System.out.print(ConsoleColors.YELLOW_BRIGHT+"\n> Choose an option (1 or 2): "+ ConsoleColors.RESET);
                String ch = scan.next();

                CreateAccount:
                if(ch.equals("1") || ch.equals("2")) {
                    if(ch.equals("1")){
                        System.out.println("\nCreating your DataBase.Bank Account:");

                        System.out.print("\tEnter your username: ");
                        String username = While.getStringScanOnly(scan);
                        System.out.print("\tEnter your Age: ");
                        int age = While.getIntegerScanOnly(scan);
                        System.out.print("\tCreate a passcode: ");
                        int passcode = While.getIntegerScanOnly(scan);

                        PreparedStatement checkStatement = connections.prepareStatement("SELECT COUNT(*) FROM UserLogin WHERE Name = ?");
                        checkStatement.setString(1, username);
                        ResultSet resultSet = checkStatement.executeQuery();
                        resultSet.next();
                        int count = resultSet.getInt(1);

                        if (count > 0) {
                            System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"\nError: A user with the username \"" + username + "\" already exists."+ ConsoleColors.RESET);
                            break CreateAccount;
                        }

                        PreparedStatement prepareStatement = connections.prepareStatement("INSERT INTO UserLogin (Name, Age, PassCode, balance) VALUES (?, ?, ?, ?)");

                        prepareStatement.setString(1, username);
                        prepareStatement.setInt(2, age);
                        prepareStatement.setInt(3, passcode);
                        prepareStatement.setDouble(4, 0.0);

                        prepareStatement.executeUpdate();

                        System.out.println(ConsoleColors.GREEN_BRIGHT+"\nYou have Successfully Created a DataBase.Bank Account "+ ConsoleColors.RESET);

                    } else {
                        loop2:
                        while(true){

                            System.out.println(ConsoleColors.RESET+"\nLogin:");
                            System.out.print("Enter your username: ");
                            String username = While.getStringScanOnly(scan);
                            System.out.print("Enter your passcode: ");
                            int passcode = While.getIntegerScanOnly(scan);

                            PreparedStatement prepareStatement = connections.prepareStatement("SELECT * FROM UserLogin WHERE Name = ? AND PassCode = ?");
                            prepareStatement.setString(1, username);
                            prepareStatement.setInt(2, passcode);
                            ResultSet resultSet = prepareStatement.executeQuery();

                            if (resultSet.next()) {

                                String userName = resultSet.getString("Name");
                                int userAge = resultSet.getInt("Age");
                                double userBalance = resultSet.getDouble("balance");

                                bank = new Bank(userName, userAge, userBalance);

                                System.out.printf(ConsoleColors.BLUE_BRIGHT+"\nWelcome back, %s!\n"+ ConsoleColors.RESET, userName);

                                Bank.bankHelp();

                                while(true){
                                    System.out.print(ConsoleColors.PURPLE_BOLD_BRIGHT+"\n\t> Command: "+ ConsoleColors.RESET);
                                    String option = scan.next().trim().toLowerCase().strip();

                                    switch (option) {
                                        case "info" -> bank.accountInfo();
                                        case "balance" -> bank.ShowBalance();
                                        case "withdraw" -> {
                                            System.out.print("Enter Withdraw Amount: $");
                                            amount = While.getDoubleScanOnly(scan);
                                            bank.withdraw(amount);
                                        }
                                        case "deposit" -> {
                                            System.out.print("Enter Deposit Amount: $");
                                            amount = While.getDoubleScanOnly(scan);
                                            bank.deposit(amount);

                                        }
                                        case "help" -> Bank.bankHelp();
                                        case "quit", "no" -> {
                                            System.out.println(ConsoleColors.RED_BOLD+"\nQuitting the program");
                                            return;
                                        }
                                        case "logout" -> {
                                            System.out.println(ConsoleColors.BLUE_BRIGHT + "\nLogging you out!\n"+ ConsoleColors.RESET);
                                            break loop2;
                                        }
                                        default ->
                                            System.out.printf(ConsoleColors.RED_BOLD_BRIGHT + "Unknown command \"%s\"" + ConsoleColors.RESET, option);
                                    }
                                }
                            } else {
                                System.out.println(ConsoleColors.RED_BRIGHT+"\nIncorrect username or passcode."+ ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE_BRIGHT+"\t 1. Return to CSVFilePractice.CSVFilePractice Menu. ");
                                System.out.println(ConsoleColors.BLUE_BRIGHT+"\t 2. Try Again!"+ ConsoleColors.RESET);
                                System.out.print(ConsoleColors.YELLOW_BRIGHT+"\n> Choose an option (1 or 2): "+ ConsoleColors.RESET);

                                int option = While.getIntegerScanOnly(scan);

                                switch (option){
                                    case 1:
                                        break loop2;
                                    case 2:
                                        break;
                                    default:
                                        System.out.printf(ConsoleColors.RED_BOLD_BRIGHT + "Unknown command \"%s\"" + ConsoleColors.RESET, option);
                                }
                            }
                        }
                    }
                }else{
                    System.out.println(ConsoleColors.RED_BRIGHT+"\nError - \""+ch+"\" not found"+ ConsoleColors.RESET);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

} // main
