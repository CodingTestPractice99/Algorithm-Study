package juyoungoh.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _771_JewelsAndStones_1 {

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> freqs = new HashSet<>();

        // 보석(J) 종류 저장
        for (char j : J.toCharArray()) {
            freqs.add(j);
        }
        // 돌(S)이 보석(J)인 경우 +1
        for (char s : S.toCharArray()) {
            if (freqs.contains(s)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        _771_JewelsAndStones_1 solution = new _771_JewelsAndStones_1();
        String J = "aA";
        String S = "aAAbbbb";
        int result = solution.numJewelsInStones(J, S);
        System.out.println("Number of jewels in stones: " + result);
    }
}
