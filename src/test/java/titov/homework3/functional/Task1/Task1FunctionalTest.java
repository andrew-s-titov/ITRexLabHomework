package titov.homework3.functional.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1FunctionalTest {
    @Test
    public void testTernaryIntPredicate() {
        Assertions.assertTrue(Task1.allValuesAreDifferentPredicate.test(1, 3, 5));
        Assertions.assertFalse(Task1.allValuesAreDifferentPredicate.test(1, 1, 1));
        Assertions.assertFalse(Task1.allValuesAreDifferentPredicate.test(300, 300, 2));
        Assertions.assertFalse(Task1.allValuesAreDifferentPredicate.test(2, 2, 300));
    }
}
