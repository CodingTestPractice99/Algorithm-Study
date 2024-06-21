package juyoungoh.programmers.lv1;

import java.util.Arrays;

public class _12954 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long x2 = x;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = x2;
            x2 += (long) x;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }
}
