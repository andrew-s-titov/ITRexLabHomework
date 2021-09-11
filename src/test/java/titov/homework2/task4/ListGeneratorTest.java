package titov.homework2.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;


public class ListGeneratorTest {

    private final ListGenerator defaultGenerator = new ListGenerator();

    @Test
    public void checkSizeInitDefault() {
        List<Integer> generatedList = defaultGenerator.generateList();
        Assertions.assertEquals(3, generatedList.size());
    }

    @Test
    public void checkSizeInitWithParams() {
        for (int i = 1; i <= 10; i++) {
            ListGenerator generator = new ListGenerator(i, 0, 100);
            List<Integer> generatedList = generator.generateList();
            Assertions.assertEquals(i, generatedList.size());
        }
    }

    @RepeatedTest(10)
    public void checkRangeDefault() {
        List<Integer> generatedList = defaultGenerator.generateList();
        for (Integer num : generatedList) {
            Assertions.assertTrue(num >= 0 && num <=9);
        }
    }

    @RepeatedTest(10)
    public void checkRangeWithParams() {
        int minNumber = (int)(Math.random()*100);
        int maxNumber = Math.max(minNumber+1, (int)(Math.random()*20));
        ListGenerator generator = new ListGenerator(5, minNumber, maxNumber);
        List<Integer> generatedList = generator.generateList();
        for (Integer num : generatedList) {
            Assertions.assertTrue(num >= minNumber && num <=maxNumber);
        }
    }
}
