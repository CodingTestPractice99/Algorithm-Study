package juyoungoh.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _819_MostCommonWord_2 {
    public static String mostCommonWord(String p, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> counts = new HashMap<>();

        String[] words = p.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for (String word : words) {
            if (!ban.contains(word)) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        System.out.println(
            mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit. Bob bob", new String[]{"hit"}));
    }
}
