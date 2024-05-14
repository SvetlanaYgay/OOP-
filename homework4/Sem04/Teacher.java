package Sem04;

public class Teacher extends User implements Comparable<Teacher> {
    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int setTeacherId(int teacherId) {
        return this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return String.format("%s id: %d, %s %s %s",
                getClass().getSimpleName(), teacherId, super.getFirstName(), super.getSecondName(),
                super.getLastName());

    }

    @Override
    public int compareTo(Teacher o) {
        if (this.teacherId > o.teacherId) {
            return 1;
        } else if (this.teacherId < o.teacherId) {
            return -1;
        }
        return 0;
    }

}
