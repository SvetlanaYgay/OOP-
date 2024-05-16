package Sem05.model.service;

import java.util.List;

import Sem05.model.Teacher;
import Sem05.model.Student;
import Sem05.model.StudentGroup;
import Sem05.model.StudyGroup;


public class StudyGroupService {
    
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        StudentGroup studentGroup = new StudentGroup(1, students);
        return new StudyGroup(teacher, studentGroup);
    }
}
