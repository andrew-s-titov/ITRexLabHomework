package titov.homework3.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {
    @Test
    public void factorial() {
        Assertions.assertEquals(1, Task4.factorial(0));
        Assertions.assertEquals(1, Task4.factorial(1));
        Assertions.assertEquals(2, Task4.factorial(2));
        Assertions.assertEquals(39916800L, Task4.factorial(11));
    }
}
