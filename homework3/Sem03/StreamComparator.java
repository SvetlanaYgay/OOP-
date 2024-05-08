package Sem03;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    // @Override
    // public int compare(Stream o1, Stream o2) {
    //     if (o1.getStreamSize() > o2.getStreamSize()) {
    //         return 1;
    //     } else if (o1.getStreamSize() < o2.getStreamSize()) {
    //         return -1;
    //     }
    //     return 0;
    // }


    // то же самое, но проще, т.к. метод <compareTo> уже переопределен в классе <Stream>
    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.compareTo(o2);
    }
}
