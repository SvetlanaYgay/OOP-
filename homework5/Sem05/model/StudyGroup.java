package Sem05.model;

public class StudyGroup {
    private Teacher teacher;
    private StudentGroup studentGroup;

    public StudyGroup(Teacher teacher, StudentGroup studentGroup) {
        this.teacher = teacher;
        this.studentGroup = studentGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "StudyGroup{" + "teacher=" + teacher + ", studentGroup=" + studentGroup + '}';

    }
    
}
