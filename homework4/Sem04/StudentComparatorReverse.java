package Sem04;

import java.util.Comparator;

public class StudentComparatorReverse implements Comparator<Student> {

    @Override
    public int compare(Student o2, Student o1) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }

}
