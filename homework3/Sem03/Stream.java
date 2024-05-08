package Sem03;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream> {
    private List<StudentGroup> groups;
    private String name;
    private int index;

    public Stream(String name, List<StudentGroup> groups) {
        this.name = name;
        this.groups = groups;
        this.index = 0;
    }

    public int getStreamSize() {
        return groups.size();
    }

    public List<StudentGroup> getGroupList() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        // это анонимный класс (вместо создания отдельного класса итератора)
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public StudentGroup next() {
                return groups.get(index++);
            }

        };
    }

    @Override
    public int compareTo(Stream o) {
        if (this.getStreamSize() > o.getStreamSize()) {
            return 1;
        } else if (this.getStreamSize() < o.getStreamSize()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s: %d групп", this.name, groups.size());
    }
}
