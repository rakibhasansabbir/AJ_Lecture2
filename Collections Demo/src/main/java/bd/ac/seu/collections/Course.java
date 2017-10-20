package bd.ac.seu.collections;

/**
 * @author rakib on 10/21/17
 * @project Collections Demo
 */
public class Course {
    public String courseCode;
    public String courseTitle;
    public Double credits;

    public Course() {
    }

    public Course(String courseCode, String courseTitle, Double credits) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", credits=" + credits +
                '}';
    }
}
