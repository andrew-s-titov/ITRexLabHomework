package titov.homework3.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6FunctionalTest {

    @Test
    public void testFunction1() {
        Assertions.assertEquals(32, Task6.function1
                .apply(1)
                .apply(2)
                .apply(3));

        Assertions.assertEquals("manORmyGOD", Task6.function2
                .apply("Man")
                .apply("My")
                .apply("or")
                .apply("god"));
    }
}
