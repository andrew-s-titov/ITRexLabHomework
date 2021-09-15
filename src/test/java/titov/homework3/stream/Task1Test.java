package titov.homework3.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    public void isPrime() {
        Assertions.assertTrue(Task1.isPrime(2));
        Assertions.assertTrue(Task1.isPrime(3));
        Assertions.assertFalse(Task1.isPrime(4));
        Assertions.assertTrue(Task1.isPrime(7919));
    }
}
