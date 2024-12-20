package juyoungoh.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _771_JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Map<Character, Integer> freqs = new HashMap<>();

        // 돌(S)의 빈도수 계산
        for (char s : S.toCharArray()) {
            // 만약 이미 계산한 돌이면 기존 값 + 1
            if (freqs.containsKey(s)) {
                freqs.put(s, freqs.get(s) + 1);
            } // 만약 처음 보는 돌이면 1
            else {
                freqs.put(s, 1);
            }
        }

        // 보석(J)의 빈도수 합산
        for (char j : J.toCharArray()) {
            // 보석과 일치하는 돌의 개수를 합산
            if (freqs.containsKey(j)) {
                count += freqs.get(j);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        _771_JewelsAndStones solution = new _771_JewelsAndStones();
        String J = "aA";
        String S = "aAAbbbb";
        int result = solution.numJewelsInStones(J, S);
        System.out.println("Number of jewels in stones: " + result);
    }
}
