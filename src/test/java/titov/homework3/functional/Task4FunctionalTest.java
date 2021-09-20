package titov.homework3.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class Task4FunctionalTest {
    @Test
    public void testCollector() {
        Assertions.assertEquals(0, Stream.of(0, 1, 2, 3).collect(Task4.collectProductOfIntSquares));
        Assertions.assertEquals(36, Stream.of(1, 2, 3).collect(Task4.collectProductOfIntSquares));
        Assertions.assertEquals(400, Stream.of(4, 5).collect(Task4.collectProductOfIntSquares));
    }
}
