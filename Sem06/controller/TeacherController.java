package Sem06.controller;

import Sem06.model.Teacher;
import Sem06.model.service.TeacherService;
import Sem06.view.TeacherView;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }


    @Override
    public void sendOnConsole() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

}
