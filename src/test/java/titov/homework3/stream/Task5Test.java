package titov.homework3.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {
    @Test
    public void sumOfOddNumbersInRange() {
        Assertions.assertEquals(0, Task5.sumOfOddNumbersInRange(0, 0));
        Assertions.assertEquals(16, Task5.sumOfOddNumbersInRange(7, 9));
        Assertions.assertEquals(125, Task5.sumOfOddNumbersInRange(21, 30));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task5.sumOfOddNumbersInRange(-5, 10));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task5.sumOfOddNumbersInRange(10, 5));
    }
}
