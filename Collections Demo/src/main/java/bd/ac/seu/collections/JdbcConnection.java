package bd.ac.seu.collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton class for getting a database connection.
 *
 * @author rakib on 10/20/17
 * @project Collections Demo
 */
public class JdbcConnection {
    private static JdbcConnection instance = new JdbcConnection();
    private static Connection connection;


    private JdbcConnection() {
        connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String DBURL = "jdbc:mysql://localhost/predictdb";
            final String USERNAME = "root";
            final String PASSWORD = "rakib";

            connection = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return connection;
    }

}

