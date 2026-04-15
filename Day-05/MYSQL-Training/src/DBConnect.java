import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "root12";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");
            conn.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
