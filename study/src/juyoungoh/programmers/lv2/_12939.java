package juyoungoh.programmers.lv2;

import java.util.Arrays;

public class _12939 {
    public static String solution(String s) {
        String s1[] = s.split(" ");
        int num[] = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
           num[i] = Integer.parseInt(s1[i]);
        }

        Arrays.sort(num);
        int max = num[num.length-1];
        int min = num[0];

        String answer = min + " " + max;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }
}
