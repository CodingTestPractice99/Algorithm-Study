package juyoungoh.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _3_LongestSubstringWithoutRepeatingCharacters_1 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int right = 0;
        int left = 0;

        for (char c : s.toCharArray()) {
            if (map.containsKey(c) && left <= map.get(c)) {
                left = map.get(c) + 1;
            } else {
                Math.max(maxLength, right - left + 1);
            }
            map.put(c, right);
            right++;
        }
        return maxLength;
    }
}
