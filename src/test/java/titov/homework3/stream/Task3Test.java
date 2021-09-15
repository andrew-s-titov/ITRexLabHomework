package titov.homework3.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3Test {
    @Test
    public void createFilteringStream() {
        List<Integer> list1 = getBoxedListFromStreams(IntStream.of(2, 4), IntStream.of(1, 3));
        List<Integer> list2 = getBoxedListFromStreams(IntStream.of(30, 60, 90), IntStream.of(75));
        List<Integer> list3 = getBoxedListFromStreams(IntStream.of(90, 30, 60, 40), IntStream.of(75, 25, 15, 105));

        Assertions.assertTrue(list1.isEmpty());
        Assertions.assertEquals(list2, List.of(75, 90));
        Assertions.assertEquals(list3, List.of(60, 75, 90, 105));
    }

    public List<Integer> getBoxedListFromStreams(IntStream evensStream, IntStream oddsStream) {
        return Task3.createFilteringStream(evensStream, oddsStream)
                .boxed()
                .collect(Collectors.toList());
    }
}
