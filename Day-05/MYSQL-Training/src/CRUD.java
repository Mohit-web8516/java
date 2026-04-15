
//  write a program which can perform all CRUD operations on a database where CRUD  means (Create,Read,Update,Delete)
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CRUD {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/WORLD?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user = "root";
        String password = "root12";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Enter your email: ");
            String email = sc.nextLine();

            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume the newline character

           

            String sql = "INSERT INTO users (name, email, age) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, age);
            

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            } else {
                System.out.println("An error occurred while inserting the user.");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
