package titov.homework1.task1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsFrequencyUtil {

    /**
     * Creates a Set of unique words from a text (String).
     *
     * @param engText a text where unique words are searched.
     * @return Set with words from the text.
     */
    public static Set<String> uniqueWordsFromText(String engText) {
        return new HashSet<>(wordsFromText(engText));
    }

    /**
     * Prints frequency of every word from a text.
     *
     * @param frequencyMap a Map with words (keys) and their frequency (values) in the text.
     */
    public static void printFrequency(Map<String, Integer> frequencyMap) {
        Set<Map.Entry<String, Integer>> frequencyEntries = frequencyMap.entrySet();
        for (Map.Entry<String, Integer> frequencyEntry : frequencyEntries) {
            System.out.println("A word \"" + frequencyEntry.getKey() +
                    "\" occurs " + frequencyEntry.getValue() + " time(s) in the text.");
        }
    }

    /**
     * Searches a word in a text and returns its frequency.
     *
     * @param engText a text where frequency of the word is calculated.
     * @param word    to look for
     * @return frequency of the word, or 0 if the words doesn't occur in the text.
     */
    public static int findWordFrequency(String engText, String word) {
        Map<String, Integer> frequencyMap = wordFrequencyMap(engText);
        return frequencyMap.getOrDefault(word, 0);
    }

    // Creates a List with words from a text (case-sensitive)
    private static List<String> wordsFromText(String engText) {
        List<String> words = new ArrayList<>();
        if (engText.isBlank()) {
            return words;
        }
        Pattern word = Pattern.compile("\\b[\\w'-]+\\b");
        Matcher matcher = word.matcher(engText);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    // Creates a Map with words from a text as keys and frequency of each word as key's value
    private static Map<String, Integer> wordFrequencyMap(String engText) {
        List<String> words = wordsFromText(engText);
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }
        return frequencyMap;
    }
}