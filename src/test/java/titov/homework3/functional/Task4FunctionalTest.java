package titov.homework3.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task4FunctionalTest {
    @Test
    public void testCollector() {
        Assertions.assertEquals(0, List.of(0, 1, 2, 3).stream().collect(Task4.collectProductOfIntSquares));
        Assertions.assertEquals(36, List.of(1, 2, 3).stream().collect(Task4.collectProductOfIntSquares));
        Assertions.assertEquals(400, List.of(4, 5).stream().collect(Task4.collectProductOfIntSquares));
    }
}
