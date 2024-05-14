package Sem04;

public class Student extends User implements Comparable<Student> {
    private int studentId;

    public Student(int studentId, String firstName, String secondName, String lastName) {
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
        return String.format("%s id: %d, %s %s %s",
                getClass().getSimpleName(), studentId, super.getFirstName(), super.getSecondName(),
                super.getLastName());
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentId > o.studentId) {
            return 1;
        } else if (this.studentId < o.studentId) {
            return -1;
        }
        return 0;
    }

}
