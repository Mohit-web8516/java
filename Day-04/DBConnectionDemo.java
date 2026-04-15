import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver

            String url = "jdbc:mysql://localhost:3306/WORLD";
            String user = "root"; // your MySQL username
            String password = "root12"; // your MySQL password

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Failed to establish connection: " + e.getMessage());
        }
    }
}
