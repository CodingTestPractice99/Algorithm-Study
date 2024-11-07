package juyoungoh.leetcode;

import java.util.HashMap;

public class _3_LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> used = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        // 문자열을 문자 단위로 반복
        for (char c : s.toCharArray()) {
            // 이미 등장했던 문자이고, 슬라이딩 윈도우의 안쪽에 있다면 left 위치 업데이트
            if (used.containsKey(c) && left <= used.get(c)) {
                left = used.get(c) + 1;
            } else {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            // 현재 문자의 위치 삽입
            used.put(c, right);
            // 오른쪽 포인터 right 는 현재 문자의 위치에 맞춰 계속 증가
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbbc"));
    }
}
