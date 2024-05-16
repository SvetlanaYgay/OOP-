package Sem05.model;

public class Student extends User {
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("%s id=%d: %s %s %s",
                getClass().getSimpleName(), studentId, super.getFirstName(), super.getSecondName(),
                super.getLastName());
    }

}
