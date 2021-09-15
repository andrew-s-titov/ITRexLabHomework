package titov.homework3.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Task2Test {
    @Test
    public void createBadWordsDetectingStream() {
        List<String> badWords = List.of("hell", "crap");

        String text1 = "hell, give me a scrap of that crap and get the hell out of here you crap";
        String text2 = "hello, give me please a scrap of that metal";

        List<String> badWordsFound1 = Task2.createBadWordsDetectingStream(text1, badWords)
                .collect(Collectors.toList());
        List<String> badWordsFound2 = Task2.createBadWordsDetectingStream(text2, badWords)
                .collect(Collectors.toList());

        Assertions.assertEquals(2, badWordsFound1.size());
        Assertions.assertTrue(checkStringSorting(badWordsFound1));

        Assertions.assertEquals(0, badWordsFound2.size());
    }

    public boolean checkStringSorting(List<String> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).compareTo(list.get(i+1)) >= 0) {
                return false;
            }
        }
        return true;
    }
}