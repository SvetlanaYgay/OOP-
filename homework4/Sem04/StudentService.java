package Sem04;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private final List<Student> studentList = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxID = 0;
        for (Student student : studentList) {
            if (maxID < student.getStudentId()) {
                maxID = student.getStudentId();
            }
        }
        studentList.add(new Student(++maxID, firstName, secondName, lastName));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

}
