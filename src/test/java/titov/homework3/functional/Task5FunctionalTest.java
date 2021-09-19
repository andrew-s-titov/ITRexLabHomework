package titov.homework3.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Task5FunctionalTest {
    Stream<String> stream1 = List.of("aaaa", "aaa", "a", "aa").stream();
    Stream<String> stream2 = List.of("level", "bbaa", "ac").stream();

    @Test
    public void testCollectorWithList1() {
        Map<Boolean, List<String>> map1 = stream1.collect(Task5.collectorIsPalindrome);
        Assertions.assertTrue(map1.get(false).isEmpty());
        Assertions.assertEquals(4, map1.get(true).size());
        Assertions.assertTrue(map1.get(true).contains("aaa"));
    }

    @Test
    public void testCollectorWithList2() {
        Map<Boolean, List<String>> map2 = stream2.collect(Task5.collectorIsPalindrome);
        Assertions.assertEquals(1, map2.get(true).size());
        Assertions.assertEquals(2, map2.get(false).size());
        Assertions.assertTrue(map2.get(false).contains("bbaa"));
        Assertions.assertTrue(map2.get(true).contains("level"));
    }
}
