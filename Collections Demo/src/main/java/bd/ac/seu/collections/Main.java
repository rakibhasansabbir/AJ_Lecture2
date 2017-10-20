package bd.ac.seu.collections;

/**
 *@author Rakib Hasan Sabbir
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Student> studentList;
    private List<Course> courseList;
    public Main() {
//        StudentDao studentDao = new StudentDaoMysqlImplementation();
        StudentDao studentDao = new StudentDaoCsvImplementation();
        studentList = studentDao.getAllStudents();

        CourseDao courseDao = new CourseDaoMysqlImplementation();
        courseList = courseDao.getAllCourses();
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

        courseList.forEach(System.out::println);
//Find out the student with the longest name

            Student maxlengthNameStudent = studentList.get(0);
            for(Student student:studentList){
                if (student.getStudentName().length() > maxlengthNameStudent.getStudentName().length())
                    maxlengthNameStudent = student;
            }
            System.out.println("max length of student is: " + maxlengthNameStudent);
        }


    public static void main(String[] args) {
        new Main();
    }
}
