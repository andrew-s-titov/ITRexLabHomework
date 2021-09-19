package titov.homework3.functional;

import java.util.function.Function;

/**
 * <p>
 * Write a curried form of the function f(x,y,z)=x+y∗y+z∗z∗z using lambda expressions in Java >8 style.
 * The result and x, y, z must be integer numbers.
 * <p>
 * Write a curried function (using lambdas) that accepts four string arguments and concatenated all in one string
 * following the rules:
 * String cases: in the result string, first and second arguments must be in lower cases and third and fourth in
 * upper cases.
 * Order of arguments concatenation: first, third, second, fourth.
 */
public class Task6 {

    // for testing
    public static final Function<Integer,
            Function<Integer,
                    Function<Integer, Integer>>> function1 =
            x -> y -> z -> x + y * y + z * z * z;

    public static final Function<String,
            Function<String,
                    Function<String,
                            Function<String, String>>>> function2 =
            a -> b -> c -> d ->
                    a.toLowerCase() +
                            c.toUpperCase() +
                            b.toLowerCase() +
                            d.toUpperCase();

    public static void main(String[] args) {
        // expecting 32
        System.out.println(function1
                .apply(1)
                .apply(2)
                .apply(3));
        // expecting "manORmyGOD
        System.out.println(function2
                .apply("Man")
                .apply("My")
                .apply("or")
                .apply("god"));
    }
}
