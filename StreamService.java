import java.util.Collections;
import java.util.List;

public class StreamService extends StreamComparator {
    public void sort(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
