package Homework_20220426.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionService {
    private static DatabaseConnectionService dbcs;

    private final String DRIVER_URL = "com.mysql.cj.jdbc.Driver";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/airport";
    private final String USERNAME = "root";
    private final String PASSWORD = "14145599nnn*";

    private DatabaseConnectionService() {
    }

    public static DatabaseConnectionService getDbcs() {
        if (dbcs == null) {
            dbcs = new DatabaseConnectionService();
        }
        return dbcs;
    }

    public Connection createConnection() {
        try {
            Class.forName(DRIVER_URL);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded.");
        }
        try {
            return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Can't get connection, credentials are probably wrong.");
        }
        return null;
    }
}
