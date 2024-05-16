package Sem05.model.service;

import java.util.ArrayList;
import java.util.List;

import Sem05.model.Teacher;
import Sem05.model.Student;
import Sem05.model.Type;
import Sem05.model.User;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(Type type, String firstName, String secondName, String lastName) {
        int id = getNewID(type);
        if (type == Type.STUDENT) {
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == Type.TEACHER) {
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }

    private int getNewID(Type type) {
        int maxID = 0;
        for (User user : userList) {
            if (user instanceof Student && type == Type.STUDENT) {
                maxID = ((Student) user).getStudentId() + 1;
            }
            if (user instanceof Teacher && type == Type.TEACHER) {
                maxID = ((Teacher) user).getTeacherID() + 1;
            }
        }
        return maxID;
    }

    public List<User> getAllUsersByType(Type type) {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student && type == Type.STUDENT) {
                resultList.add(user);
            } else if (user instanceof Teacher && type == Type.TEACHER) {
                resultList.add(user);
            }
        }
        return resultList;
    }
}
