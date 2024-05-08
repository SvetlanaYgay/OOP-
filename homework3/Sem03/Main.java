package Sem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List<Student> studentList = new ArrayList<>();
        // studentList.add(new Student(4, "aab", "aab", "aab"));
        // studentList.add(new Student(3, "aaa", "aaa", "aaa"));
        // studentList.add(new Student(2, "Aaa", "Aaa", "Aaa"));
        // studentList.add(new Student(1, "bbb", "bbb", "bbb"));

        // for (Student student : studentList) {
        //     System.out.println(student);
        // }

        // StudentGroup studentGroup = new StudentGroup(studentList);
        // studentGroup.addStudent(new Student(25, "asdf", "asdf", "asd"))
        //         .addStudent(new Student(68798, "gsdfds", "sdfvsdf", "dvsdf"));

        // System.out.println();
        // перебор экземпляра класса в цикле без использования итератора
        // for (Student student : studentGroup.getStudentList()) {
        //     System.out.println(student);
        // }

        // System.out.println();
        // используется интерфейс Iterator<>
        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // System.out.println();
        // используется интерфейс Iterable<>
        // for (Student student : studentGroup) {
        //     System.out.println(student);
        // }

        // StudentGroupService service = new StudentGroupService(studentGroup);
        // System.out.println();
        // сортировка по studentId (переопределен compareTo)
        // for (Student student : service.getSortedStudentGroup()) {
        //     System.out.println(student);
        // }

        // сортировка по ФИО (зависит от выбранного компаратора в getSortedStudentGroupByFIO)
        // System.out.println();
        // for (Student student : service.getSortedStudentGroupByFIO()) {
        //     System.out.println(student);
        // }

        // *****************Домашка********************

        StudentGroup group1 = new StudentGroup();
        StudentGroup group2 = new StudentGroup();
        StudentGroup group3 = new StudentGroup();
        StudentGroup group4 = new StudentGroup();
        StudentGroup group5 = new StudentGroup();
        StudentGroup group6 = new StudentGroup();
        StudentGroup group7 = new StudentGroup();
        StudentGroup group8 = new StudentGroup();
        StudentGroup group9 = new StudentGroup();
        StudentGroup group10 = new StudentGroup();

        Stream stream1 = new Stream("Поток 1", Arrays.asList(group1, group2, group3, group4, group5));
        Stream stream2 = new Stream("Поток 2", Arrays.asList(group9, group10));
        Stream stream3 = new Stream("Поток 3", Arrays.asList(group6, group7, group8));

        List<Stream> streamsList = new ArrayList<>(Arrays.asList(stream1, stream2, stream3));
        System.out.println(streamsList);
        System.out.println();

        // сортировка без компаратора
        // класс Stream имплементирует Comparable<Stream> и в нем переопределен метод <compareTo>
        Collections.sort(streamsList);
        for (Stream stream : streamsList) {
            System.out.println(stream);
        }

        // сортировка с использованием компаратора StreamComparator,
        // который имплементирует Comparator<Stream>
        StreamService streamService = new StreamService(streamsList);

        System.out.println();
        // метод getSortedStreams1 использует Collections.sort
        for (Stream stream : streamService.getSortedStreams1(streamsList)) {
            System.out.println(stream);
        }

        System.out.println();
        // метод getSortedStreams2 использует StreamComparator()
        for (Stream stream : streamService.getSortedStreams2()) {
            System.out.println(stream);
        }
    }
}
