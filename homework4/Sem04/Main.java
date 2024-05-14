package Sem04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List<Student> studentList = new ArrayList<>();
        // studentList.add(new Student(4, "aab", "aab", "aab"));
        // studentList.add(new Student(3, "aaa", "aaa", "aaa"));
        // studentList.add(new Student(2, "Aaa", "Aaa", "Aaa"));
        // studentList.add(new Student(1, "bbb", "bbb", "bbb"));

        // // System.out.println(studentList);
        // for (Student student : studentList) {
        //     System.out.println(student);
        // }

        // StudentGroup studentGroup = new StudentGroup(studentList);
        // // studentGroup.addStudent(new Student(25, "asdf", "asdf", "asd"))
        // //             .addStudent(new Student(68798, "gsdfds", "sdfvsdf", "dvsdf"));
        // // System.out.println(studentGroup);
        // System.out.println();
        // for (Student student : studentGroup.getStudentList()) {
        //     System.out.println(student);
        // }

        // System.out.println();
        // // используется интерфейс Iterator<>
        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // System.out.println();
        // // используется интерфейс Iterable<>
        // for (Student student : studentGroup) {
        //     System.out.println(student);
        // }

        // StudentGroupService service = new StudentGroupService(studentGroup);
        // System.out.println();
        // for (Student student : service.getSortedStudentGroup()) {
        //     System.out.println(student);
        // }

        // System.out.println();
        // for (Student student : service.getSortedStudentGroupByFIO()) {
        //     System.out.println(student);
        // }

        // StudentController controller = new StudentController();
        // controller.create("aab", "aab", "aab");
        // controller.create("aaa", "aaa", "aaa");
        // controller.create("Aaa", "Aaa", "Aaa");
        // controller.create("bbb", "bbb", "bbb");
        // controller.sendOnConsole();

        // ***********Домашка************
        TeacherController tController = new TeacherController();
        tController.create("Иван", "Петрович", "Сидоров");
        tController.create("Марфа", "Васильевна", "Васнецова");
        tController.create("Мага", "Владимирович", "Магомедов");
        tController.create("Александр", "Андреевич", "Пузиков");
        tController.create("Марина", "Николаевна", "Морозова");
        tController.create("Карл", "Андреевич", "Попов");
        tController.create("Александр", "Иванович", "Иванов");
        tController.create("Алена", "Антоновна", "Маринина");
        tController.sendOnConsole();

    }
}
