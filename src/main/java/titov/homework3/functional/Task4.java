package titov.homework3.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 */
public class Task4 {

    // for testing
    public static final Collector<Integer, ?, Long> collectProductOfIntSquares =
            Collectors.reducing(1L, Long::valueOf, (a, b) -> a * b * b);

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3);

        long val = numbers.stream()
                .collect(collectProductOfIntSquares);

        System.out.println(val);
    }
}