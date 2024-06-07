import java.util.Comparator;
import java.util.List;

public class StreamService {
    public List<Stream> getSortedStreams(List<Stream> streams) {
        streams.sort((Comparator<? super Stream>) new StreamComparator());
        return streams;
    }
}
