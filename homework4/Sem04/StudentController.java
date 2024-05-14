package Sem04;

public class StudentController implements UserController<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }

    @Override
    public void sendOnConsole() {
        studentView.sendOnConsole(studentService.getStudentList());
    }

}
