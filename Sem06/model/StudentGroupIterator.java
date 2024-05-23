package Sem06.model;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private List<Student> studentList;
    private int index;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        if (hasNext()) {
            return studentList.get(index++);
        }
        return null;
    }

    @Override
    public void remove() {
        studentList.remove(index);
    }

}
