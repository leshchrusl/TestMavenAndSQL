package TestSQL;

import java.sql.*;

public class DBWorker {

    private final String HOST = "jdbc:mysql://localhost:3306/test";
    private final String USERNAME = "root";
    private final String PASSWORD = "192837465aD";

    Connection connection;

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Не удалось установить соединение");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
