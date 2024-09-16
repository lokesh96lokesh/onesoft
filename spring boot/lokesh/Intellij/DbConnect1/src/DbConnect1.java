import java.sql.DriverManager;
import java.sql.*;

public class DbConnect1 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loan", "root", "root");
            System.out.println("Connected With the database successfully");
        } catch (SQLException e) {

            System.out.println("Error while connecting to the database");

        }
    }

    }

