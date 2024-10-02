package juyoungoh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_GroupAnagrams_1 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // 애너그램 결과를 보관하기 위한 맵 선언
        Map<String, List<String>> map = new HashMap<>();

        // 입력값인 문자열 배열을 순회
        for (String s : strs) {
            // 문자열을 문자 배열로 변환
            char cArr[] = s.toCharArray();
            // 문자 배열 정렬
            Arrays.sort(cArr);
            // 문자 배열을 키로 하기 위해 다시 문자열로 변환
            String key = String.valueOf(cArr);
            // 만약 기존에 없던 키라면 빈 리스트를 삽입
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // 키에 해당하는 리스트에 추가
            map.get(key).add(s);
        }
        // 문제에서 요구하는 출력값 형태 변경
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
