package titov.homework3.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Task7FunctionalTest {
    List<Integer> list1 = List.of(1, 1, 1);
    List<Integer> list2 = List.of(1, 2, 3);

    @Test
    public void testIdentityTransformation() {
        Assertions.assertEquals(list1, Task7.identityTransformation.apply(list1));
        Assertions.assertEquals(list2, Task7.identityTransformation.apply(list2));
    }

    @Test
    public void testMultTwoAndThenAddOneTransformation() {
        Assertions.assertEquals(List.of(3, 3, 3), Task7.multTwoAndThenAddOneTransformation.apply(list1));
        Assertions.assertEquals(List.of(3, 5, 7), Task7.multTwoAndThenAddOneTransformation.apply(list2));
    }

    @Test
    public void testSquareAndThenGetNextEvenNumberTransformation() {
        Assertions.assertEquals(List.of(2, 2, 2), Task7.squareAndThenGetNextEvenNumberTransformation.apply(list1));
        Assertions.assertEquals(List.of(2, 6, 10), Task7.squareAndThenGetNextEvenNumberTransformation.apply(list2));
    }

    @Test
    public void testMultifunctionalMapper() {
        List<IntUnaryOperator> intOperatorsList = List.of(n -> n + 1, n -> n * n, n -> n + 2);
        UnaryOperator<List<Integer>> operator = Task7.multifunctionalMapper.apply(intOperatorsList);
        Assertions.assertEquals(List.of(6, 6, 6), operator.apply(list1));
        Assertions.assertEquals(List.of(6, 11, 18), operator.apply(list2));

        List<IntUnaryOperator> emptyOperatorList = Collections.emptyList();
        UnaryOperator<List<Integer>> operator2 = Task7.multifunctionalMapper.apply(emptyOperatorList);
        Assertions.assertEquals(list1, operator2.apply(list1));
        Assertions.assertEquals(list2, operator2.apply(list2));
    }
}
