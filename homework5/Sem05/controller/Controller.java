package Sem05.controller;

import Sem05.view.StudentView;
import Sem05.view.StudyGroupView;
import Sem05.view.TeacherView;
import Sem05.model.Teacher;

import java.util.ArrayList;
import java.util.List;

import Sem05.model.Student;
import Sem05.model.Type;
import Sem05.model.User;
import Sem05.model.service.DataService;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudyGroupView sGroupView = new StudyGroupView();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(Type.STUDENT, firstName, secondName, lastName);
    }

    public void printAllStudents() {
        for (User user : dataService.getAllUsersByType(Type.STUDENT)) {
            studentView.printOnConsole((Student) user);
        }
    }

    public List<Student> getAllStudents() {
        List<Student> resultList = new ArrayList<>();
        for (User user : dataService.getAllUsersByType(Type.STUDENT)) {
            resultList.add((Student) user);
        }
        return resultList;
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(Type.TEACHER, firstName, secondName, lastName);
    }

    public void printAllTeachers() {
        for (User user : dataService.getAllUsersByType(Type.TEACHER)) {
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> resultList = new ArrayList<>();
        for (User user : dataService.getAllUsersByType(Type.TEACHER)) {
            resultList.add((Teacher) user);
        }
        return resultList;
    }

    public Teacher getTeacherByID(int teacherID) {
        for (User user : dataService.getAllUsersByType(Type.TEACHER)) {
            if (user instanceof Teacher && ((Teacher)user).getTeacherID() == teacherID) {
                return ((Teacher)user);
            }
        }
        return null;
    }


}
