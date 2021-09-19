package titov.homework3.functional.Task1;

import java.util.stream.IntStream;

/**
 * You need to write your own functional interface (TernaryIntPredicate) and use it with a
 * lambda expression.
 * The interface must have a single non-static (and non-default) method test with
 * three int arguments that returns boolean value.
 * Besides, you need to write a lambda expression with three int arguments using your
 * TernaryIntPredicate.
 * <p>
 * The lambda expression has to return true if all passed values are different otherwise false.
 * The name of the instance is allValuesAreDifferentPredicate. It should be a static field.
 * <p>
 * Sample Input 1:
 * 1 1 1
 * <p>
 * Sample Output 1:
 * False
 * <p>
 * Sample Input 2:
 * 2 3 4
 * <p>
 * Sample Output 2:
 * True
 */
public class Task1 {

    // for testing
    public static final TernaryIntPredicate<Integer> allValuesAreDifferentPredicate =
            (a, b, c) -> IntStream.of(a, b, c)
                    .distinct()
                    .count()
                    == 3;

    public static void main(String[] args) {
        // expect false
        System.out.println(allValuesAreDifferentPredicate.test(1 , 1, 1));
        // expect true
        System.out.println(allValuesAreDifferentPredicate.test(2 , 3, 4));
    }
}
