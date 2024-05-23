package Sem06.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Sem06.model.Student;
import Sem06.model.StudentGroup;
import Sem06.model.UserComparator;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }
    
    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        // studentList.sort(new StudentComparatorReverse());
        return studentList;
    }
}
