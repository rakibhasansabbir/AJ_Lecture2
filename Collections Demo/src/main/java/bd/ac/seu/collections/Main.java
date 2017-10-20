package bd.ac.seu.collections;

import java.sql.*;

public class Main {
    public Main() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            final String DBURL = "jdbc:mysql://localhost/predictdb";
            final String USERNAME = "root";
            final String PASSWORD = "rakib";

            Connection connection = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();

            String query = "select * from student";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int studentId = resultSet.getInt("studentId");
                String studentName = resultSet.getString("studentName");
                System.out.println(studentId + ", "+ studentName);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
