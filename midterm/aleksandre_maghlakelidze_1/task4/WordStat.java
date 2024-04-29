package midterm.aleksandre_maghlakelidze_1.task4;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all different words
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);
        System.out.println("Set of all different words:");
        System.out.println(uniqueWords);

        // Create a map with word length as key and count as value
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }

        System.out.println("\nWord length count:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue() + " words");
        }
    }
}