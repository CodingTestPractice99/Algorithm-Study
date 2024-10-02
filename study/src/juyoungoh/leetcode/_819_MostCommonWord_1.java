package juyoungoh.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _819_MostCommonWord_1 {

    public static String mostCommonWord(String p, String[] banned) {
        Set<String> stringSet = new HashSet<>(List.of(banned));
        Map<String, Integer> map = new HashMap<>();

        String arr[] = p.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for (String s : arr) {
            if (!stringSet.contains(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    /**
     *import java.util.*;
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         // Map 생성 및 데이터 추가
     *         Map<String, Integer> map = new HashMap<>();
     *         map.put("apple", 40);
     *         map.put("banana", 10);
     *         map.put("orange", 30);
     *         map.put("grape", 20);
     *
     *         // Map의 entrySet을 List로 변환
     *         List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
     *
     *         // 값에 따라 정렬
     *         entryList.sort(Map.Entry.comparingByValue());
     *
     *         // 정렬된 결과 출력
     *         for (Map.Entry<String, Integer> entry : entryList) {
     *             System.out.println(entry.getKey() + ": " + entry.getValue());
     *         }
     *     }
     * }
     */
    public static void main(String[] args) {
        System.out.println(
            mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit. Bob bob", new String[]{"hit"}));
    }
}
