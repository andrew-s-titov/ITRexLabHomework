package titov.homework3.functional;

import java.util.List;
import java.util.function.IntPredicate;

/**
 * Write the disjunctAll method that accepts a list of
 * IntPredicate's and returns a single IntPredicate.
 * The result predicate is a disjunction of all input predicates.
 *
 * If the input list is empty then the result predicate should
 * return false for any integer value (always false).
 */
public class Task2 {

    /**
     * The method represents a disjunct operator for a list of predicates.
     * For an empty list it returns the always false predicate.
     */
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return predicates.stream().reduce(IntPredicate::or).orElse(n -> false);
    }
}