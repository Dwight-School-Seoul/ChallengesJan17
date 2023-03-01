import java.sql.*;

public class BankDB {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/BankDB";
        String username = "admin";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connections = DriverManager.getConnection(url,username,password);
            Statement statement = connections.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from UserLogin");

            while(resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2)+" "+resultSet.getInt(3));
            }
            connections.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

