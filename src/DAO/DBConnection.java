package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseacademy", "root", "root");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }

}
