package bd.ac.seu.collections;

/**
 *@author Rakib Hasan Sabbir
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Student> studentList;
    public Main() {
        System.out.println("under main");
        try {
            Connection connection = JdbcConnection.getConnection();
            JdbcConnection.getConnection();
            JdbcConnection.getConnection();
            JdbcConnection.getConnection();
            JdbcConnection.getConnection();
            JdbcConnection.getConnection();
            JdbcConnection.getConnection();

            Statement statement = connection.createStatement();

            String query = "select * from student";
            ResultSet resultSet = statement.executeQuery(query);
            studentList = new ArrayList<>();
            while (resultSet.next()){
                int studentId = resultSet.getInt("studentId");
                String studentName = resultSet.getString("studentName");
                Student student = new Student(studentId,studentName);
                studentList.add(student);
            }
/*
            for (int i = 0; i<studentList.size();i++){
                System.out.println(studentList.get(i));
            }
*/
/*
            for (Student student: studentList){
                System.out.println(student);
            }
*/
//Find out the student with the longest name

            Student maxlengthNameStudent = studentList.get(0);
            for(Student student:studentList){
                if (student.getStudentName().length() > maxlengthNameStudent.getStudentName().length())
                    maxlengthNameStudent = student;
            }
            System.out.println("max length of student is: " + maxlengthNameStudent);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
