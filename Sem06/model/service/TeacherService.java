package Sem06.model.service;

import java.util.ArrayList;
import java.util.List;

import Sem06.model.Teacher;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachersList = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxID = 0;
        for (Teacher teacher : teachersList) {
            if (maxID < teacher.getTeacherId()) {
                maxID = teacher.getTeacherId();
            }
        }
        teachersList.add(new Teacher(++maxID, firstName, secondName, lastName));
    }

    public List<Teacher> getTeacherList() {
        return teachersList;
    }

}
