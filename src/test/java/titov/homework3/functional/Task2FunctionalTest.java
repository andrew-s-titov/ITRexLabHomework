package titov.homework3.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;

public class Task2FunctionalTest {
    List<IntPredicate> list = List.of(
            (n) -> n > 5, (n) -> n == 10, (n) -> n == 20
    );

    @ParameterizedTest
    @ValueSource(ints = {6, 10, 50})
    public void testDisjunctAll(int number) {
        IntPredicate result = Task2.disjunctAll(list);
        Assertions.assertTrue(result.test(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -10, 3})
    public void testDisjunctAllFalse(int number) {
        IntPredicate result = Task2.disjunctAll(list);
        Assertions.assertFalse(result.test(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 10, 50, 0, -10, 3})
    public void testDisjunctAllEmpty(int number) {
        IntPredicate resultForEmpty = Task2.disjunctAll(Collections.emptyList());
        Assertions.assertFalse(resultForEmpty.test(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 10, 50, 0, -10, 3})
    public void testDisjunctAllNull(int number) {
        IntPredicate resultForEmpty = Task2.disjunctAll(null);
        Assertions.assertFalse(resultForEmpty.test(number));
    }
}