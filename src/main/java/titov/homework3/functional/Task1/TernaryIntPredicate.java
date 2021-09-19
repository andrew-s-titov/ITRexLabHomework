package titov.homework3.functional.Task1;

@FunctionalInterface
interface TernaryIntPredicate<Integer> {
    boolean test(Integer num1, Integer num2, Integer num3);
}