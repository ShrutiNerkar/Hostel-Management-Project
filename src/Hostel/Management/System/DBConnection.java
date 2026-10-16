
package Hostel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
        Connection connection;
    Statement statement;

    public DBConnection() {
        try {
            String url = java.lang.System.getenv("DB_URL");
            String user = java.lang.System.getenv("DB_USER");
            String password = java.lang.System.getenv("DB_PASSWORD");

            connection = DriverManager.getConnection(url, user, password);
            java.lang.System.out.println("Database connected successfully!");
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
