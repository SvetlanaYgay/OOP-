package Sem03;

import java.util.Collections;
import java.util.List;

public class StreamService {
    List<Stream> streamsList;

    public StreamService(List<Stream> streamsList) {
        this.streamsList = streamsList;
    }
    

    public List<Stream> getSortedStreams1(List<Stream> streamsList) {
        Collections.sort(streamsList);
        return streamsList;
    }

    public List<Stream> getSortedStreams2() {
        streamsList.sort(new StreamComparator());
        return streamsList;
    }

}
