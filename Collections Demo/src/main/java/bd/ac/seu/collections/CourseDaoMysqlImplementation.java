package bd.ac.seu.collections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rakib on 10/21/17
 * @project Collections Demo
 */
public class CourseDaoMysqlImplementation implements CourseDao {
    private List<Course> courseList;

    @Override
    public List<Course> getAllCourses() {
        try {
            Connection connection = JdbcConnection.getConnection();
            Statement statement = connection.createStatement();

            String query = "select * from course";
            ResultSet resultSet = statement.executeQuery(query);
            courseList = new ArrayList<>();
            while (resultSet.next()) {
                String courseCode = resultSet.getString("courseCode");
                String courseTitle = resultSet.getString("courseTitle");
                Double creditHours = resultSet.getDouble("credits");
                Course course = new Course(courseCode,courseTitle,creditHours);
                courseList.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courseList;
    }
}
