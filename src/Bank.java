import java.sql.*;
import java.util.Scanner;

public class Bank {

    private double balance = 0;
    private final String name;
    private double amount;
    private final int age;
    private final String url="jdbc:mysql://localhost:3306/BankDB";
    private final String username = "admin";
    private final String password = "";

    public Bank(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void accountInfo(){
        System.out.println("\nAccount Info:");
        System.out.println(ConsoleColors.RESET+"\tName: " + name);
        System.out.println("\tAge: " + age);
    }

    public void ShowBalance(){
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"\nYour Bank Account Balance is: $"+balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf(ConsoleColors.YELLOW_BOLD_BRIGHT + "\nYou have successfully withdrawn %s$%d%s from your account.\n", ConsoleColors.GREEN_BOLD_BRIGHT, amount, ConsoleColors.YELLOW_BOLD_BRIGHT);

            String sql = "UPDATE UserLogin SET balance = ? WHERE Name = ?";
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setDouble(1, balance);
                preparedStatement.setString(2, name);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Error updating balance: " + e.getMessage() + ConsoleColors.RESET);
            }
        } else {
            System.out.printf(ConsoleColors.RED_BOLD_BRIGHT + "\nYou don't have enough money in your bank account to withdraw %s$%d. \n", ConsoleColors.GREEN_BOLD_BRIGHT, amount);
        }
    }


    public void deposit(double amount) throws SQLException {
        this.amount = amount;
        balance += amount;

        String sql = "UPDATE UserLogin SET balance = ? WHERE Name = ?";
        Connection connections = DriverManager.getConnection(url,username,password);
        PreparedStatement preparedStatement = connections.prepareStatement(sql);

        preparedStatement.setDouble(1, balance);
        preparedStatement.setString(2, name);

        int rows = preparedStatement.executeUpdate();

        if (rows > 0) {
            System.out.printf(ConsoleColors.YELLOW_BOLD_BRIGHT+"\nYou have successfully deposited %s$%f%s in your account.\n",ConsoleColors.GREEN_BOLD_BRIGHT, amount, ConsoleColors.YELLOW_BOLD_BRIGHT);
        }
    }

    public void StartDeposit(double amount){
        this.amount = amount;
        balance += amount;
    }

    private static void bankHelp(){
        System.out.println(ConsoleColors.RESET+"\nCommands that you can use:");
        System.out.println(ConsoleColors.RESET+"\t> Info - To show your account information" +
                "\n\t> Balance - To show your account balance" +
                "\n\t> Withdraw - To withdraw from you account " +
                "\n\t> Deposit - To deposit to your account " +
                "\n\t> help - To show this list " +
                "\n\t> Quit - to quit the program");

    }

    public static void theBank(){

        String url="jdbc:mysql://localhost:3306/BankDB";
        String username = "admin";
        String password = "";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connections = DriverManager.getConnection(url,username,password);
            Statement statement = connections.createStatement();

            Scanner scan = new Scanner(System.in);
            int amount;
            boolean quit = false;
            Bank bank;

            System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"\n------------{ John's Bank For Foreigners }------------\n"+ConsoleColors.RESET);

            System.out.println("1. Create a bank account.");
            System.out.println("2. Login to a bank account.");
            System.out.print(ConsoleColors.YELLOW_BRIGHT+"\n> Choose an option (1 or 2): ");

            String ch = scan.next();

            if(ch.equals("1")){
                System.out.println("\nCreating your Bank Account:");

                System.out.print("\tEnter your name: ");
                String name = scan.next();
                System.out.print("\tEnter your Age: ");
                int age = scan.nextInt();
                System.out.print("\tCreate a passcode: ");
                int passcode = scan.nextInt();

                PreparedStatement prepareStatement = connections.prepareStatement("INSERT INTO UserLogin (Name, Age, PassCode, balance) VALUES (?, ?, ?, ?)");

                prepareStatement.setString(1, name);
                prepareStatement.setInt(2, age);
                prepareStatement.setInt(3, passcode);
                prepareStatement.setDouble(4, 0.0);

                prepareStatement.executeUpdate();

                System.out.println(ConsoleColors.GREEN+"You have Successfully Created a Bank Account ");

            } else if(ch.equals("2")){

                System.out.println(ConsoleColors.RESET+"\nLogin:");
                System.out.print("Enter your name: ");
                String name = scan.next();
                System.out.print("Enter your passcode: ");
                int passcode = scan.nextInt();

                PreparedStatement prepareStatement = connections.prepareStatement("SELECT * FROM UserLogin WHERE Name = ? AND PassCode = ?");
                prepareStatement.setString(1, name);
                prepareStatement.setInt(2, passcode);
                ResultSet resultSet = prepareStatement.executeQuery();

                if (resultSet.next()) {

                    String userName = resultSet.getString("Name");
                    int userAge = resultSet.getInt("Age");
                    double userBalance = resultSet.getDouble("balance");

                    bank = new Bank(userName, userAge);

                    bank.StartDeposit(resultSet.getDouble("balance"));
                    System.out.printf("\nWelcome back, %s!\n", userName);

                    Bank.bankHelp();

                    while(!quit){
                        System.out.print(ConsoleColors.PURPLE_BOLD_BRIGHT+"\n\t> Command: "+ConsoleColors.RESET);
                        String option = scan.next().trim().toLowerCase().strip();

                        switch (option) {
                            case "info" -> bank.accountInfo();
                            case "balance" -> bank.ShowBalance();
                            case "withdraw" -> {
                                System.out.print("Enter Withdraw Amount: $");
                                amount = scan.nextInt();
                                bank.withdraw(amount);
                            }
                            case "deposit" -> {
                                System.out.print("Enter Deposit Amount: $");
                                amount = scan.nextInt();
                                bank.deposit(amount);

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
                } else {
                    System.out.println("Incorrect name or passcode. Please try again.");
                }
            }
            connections.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

} // main
