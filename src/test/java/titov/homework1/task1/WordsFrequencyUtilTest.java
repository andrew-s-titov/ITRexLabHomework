package titov.homework1.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordsFrequencyUtilTest {
    private final String test1 = "Hey hey, buddy! I didn't want to say \"bla-bla bla-bla bla-bla\", buddy, hey..!";
    private final String test2 = " _Mayor May* -Maya #may!! -_mayy.y";

    @Test
    public void uniqueWordsFromTextTest() {
        int result1 = WordsFrequencyUtil.uniqueWordsFromText(test1).size();
        int result2 = WordsFrequencyUtil.uniqueWordsFromText(test2).size();
        Assertions.assertEquals(9, result1);
        Assertions.assertEquals(6, result2);
    }

    @Test
    public void wordFrequencyTest() {
        int heyFrequency = WordsFrequencyUtil.findWordFrequency(test1, "hey");
        int blaBlaFrequency = WordsFrequencyUtil.findWordFrequency(test1, "bla-bla");
        int blaFrequency = WordsFrequencyUtil.findWordFrequency(test1, "bla");
        Assertions.assertEquals(2, heyFrequency);
        Assertions.assertEquals(3, blaBlaFrequency);
        Assertions.assertEquals(0, blaFrequency);
    }
}
