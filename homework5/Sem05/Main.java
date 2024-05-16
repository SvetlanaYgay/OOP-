package Sem05;

import java.util.ArrayList;
import java.util.List;

import Sem05.model.service.StudyGroupService;
import Sem05.model.Teacher;
import Sem05.model.Student;
import Sem05.model.StudyGroup;
import Sem05.controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createStudent("Иван", "Иванович", "Иванов");
        controller.createStudent("Петр", "Петрович", "Петров");
        controller.createStudent("Сидор", "Сидорович", "Сидоров");
        controller.createStudent("Михаил", "Сергеевич", "Андропов");

        controller.createTeacher("Алена", "Васильевна", "Сорокина");

        StudyGroupService studyGroupService = new StudyGroupService();
        StudyGroup studyGroup1 = studyGroupService.createStudyGroup(controller.getTeacherByID(0), controller.getAllStudents());
        System.out.println(studyGroup1);

    }

}
