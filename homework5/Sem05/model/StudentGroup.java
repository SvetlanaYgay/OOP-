package Sem05.model;

import java.util.List;

public class StudentGroup {
    private List<Student> studentsList;
    private int studentGroupID;

    public StudentGroup(int studentGroupID, List<Student> studentsList) {
        this.studentsList = studentsList;
        this.studentGroupID = studentGroupID;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public int getStudentGroupID() {
        return studentGroupID;
    }

    public void setStudentGroupID(int studentGroupID) {
        this.studentGroupID = studentGroupID;
    }

    @Override
    public String toString() {
        return String.format("%s id=%d: %s",
                getClass().getSimpleName(), studentGroupID, studentsList);

    }

}
