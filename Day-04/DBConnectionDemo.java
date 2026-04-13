//write a program to create a connection with database and display the message "Connection established successfully" if connection is established otherwise display the error message.
// Note: you need to add mysql connector jar file in your project to establish connection with mysql database.
// you can download mysql connector jar file from the official website of mysql and add it to your project.
// you also need to create a database in mysql and provide the database name, username and password in the connection string.\
//explain the code in detail and also explain the steps to establish connection with mysql database.

//1. First, you need to import the necessary classes for establishing a connection with the database. In this case, we need to import java.sql.Connection, java.sql.DriverManager and java.sql.SQLException.

//2. Next, you need to load the JDBC driver for MySQL. This can be
// done using the Class.forName() method. The driver class for MySQL is "com.mysql.cj.jdbc.Driver".

//3. After loading the driver, you can establish a connection with the database using the DriverManager.getConnection() method. You need to provide the connection string, username and password as parameters to this method. The connection string for MySQL is "jdbc:mysql://localhost:3306/mydb", where "localhost" is the hostname, "3306" is the port number and "mydb" is the database name.

//4. If the connection is established successfully, you can display a message "Connection established successfully

//5. If there is an error while establishing the connection, you can catch the SQLException and display the error message.

//Note: Make sure to replace "username" and "password" with your actual MySQL username and password in the connection string.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionDemo {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WORLD", "username", "root12");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (con != null) {
            System.out.println("Connection established successfully!!!!!!");
    } else {
        System.out.println("Failed to establish connection.");
    }
}
}

// HOW TO CONNECT SQL

// 1. First, you need to download the MySQL Connector/J from the official MySQL
// website and add it to your project.

// 2. Next, you need to load the JDBC driver for MySQL using the Class.forName()
// method.

// 3. After loading the driver, you can establish a connection with the database
// using the DriverManager.getConnection() method. You need to provide the
// connection string, username and password as parameters to this method.

// 4. If the connection is established successfully, you can display a message
// "Connection established successfully

// 5. If there is an error while establishing the connection, you can catch the
// SQLException and display the error message.

// Note: Make sure to replace "username" and "password" with your actual MySQL
// username and password in the connection string.