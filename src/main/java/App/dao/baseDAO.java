package App.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

public class baseDAO {
    private DataSource connectionPool;

    public static Connection getConnection() {

        // login information
        final String url = " ";
        final String user = " ";
        final String password = " ";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection with target has been established");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}