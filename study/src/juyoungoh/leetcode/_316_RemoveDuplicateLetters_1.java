package juyoungoh.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class _316_RemoveDuplicateLetters_1 {
    public String removeDuplicateLetters(String s) {
        // 문자 개수를 계산해서 담아둘 변수 선언
        Map<Character, Integer> counter = new HashMap<>();
        // 이미 처리한 문자 여부를 확인하기 위한 변수 선언
        Map<Character, Boolean> seen = new HashMap<>();
        // 문제 풀이에 사용할 스택 선언
        Deque<Character> stack = new ArrayDeque<>();

        // 문자별 개수 계산
        for (char c : s.toCharArray()) {
            counter.put(c, counter.get(c) == null ? 1 : counter.get(c) + 1);
        }

        for (char c : s.toCharArray()) {
            // 현재 처리하는 문자는 카운터에서 -1 처리
            counter.put(c, counter.get(c) - 1);
        }
        return "";
    }
}
