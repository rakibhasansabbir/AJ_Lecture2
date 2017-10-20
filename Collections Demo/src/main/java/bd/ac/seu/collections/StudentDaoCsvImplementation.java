package bd.ac.seu.collections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rakib on 10/20/17
 * @project Collections Demo
 */
public class StudentDaoCsvImplementation implements StudentDao {
    List<Student> studentList;
    @Override
    public List<Student> getAllStudents() {

        studentList = new ArrayList<>();
        try (RandomAccessFile input = new RandomAccessFile("students.csv","r")){
                input.readLine();
                String line;

                while ((line = input.readLine()) != null){
                    int comaIndex = line.indexOf(",");
                    String id = line.substring(0,comaIndex);
                    String name = line.substring(comaIndex + 1);

                    Student student = new Student(Integer.parseInt(id),name);
                    studentList.add(student);
                }
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
