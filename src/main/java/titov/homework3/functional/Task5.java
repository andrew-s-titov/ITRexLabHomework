package titov.homework3.functional;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * <p>
 * Write a collector that partitions all words in a stream into two groups:
 * palindromes (true) and usual words (false). The collector should return Map<Boolean, List<String>>.
 * All input words will be in the same case (lower).
 * <p>
 * Let's remind, a palindrome is a word or phrase which reads the same backward or forward,
 * such as noon or level. In our case, a palindrome is always a word.
 * For details, see https://en.wikipedia.org/wiki/Palindrome
 * <p>
 * Hint: the method reverse() of StringBuilder may help you.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 *
 *
 Sample Input 1:
 aaaa aaa a aa
 Sample Output 1:
 {false=[], true=[aaaa, aaa, a, aa]}
 Sample Input 2:
 level bbaa ac
 Sample Output 2:
 {false=[bbaa, ac], true=[level]}
 */
public class Task5 {

    // for testing
    public static final Collector<String, ?, Map<Boolean, List<String>>> collectorIsPalindrome =
            Collectors.partitioningBy((n -> new StringBuilder(n).reverse().toString().equals(n)));

    public static void main(String[] args) {
        String[] words = {"aaaa", "aaa", "a", "aa"};

        Map<Boolean, List<String>> palindromeOrNoMap = Arrays.stream(words)
                .collect(collectorIsPalindrome);

        System.out.println(palindromeOrNoMap);
    }

}