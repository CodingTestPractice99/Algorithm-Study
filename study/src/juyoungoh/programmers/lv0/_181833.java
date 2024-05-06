package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181833 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int zero = 0;
        int one = 1;

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (i == j) {
                    answer[i][j] = one;
                } else {
                    answer[i][j] = zero;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3)));
        // [[1, 0, 0], [0, 1, 0], [0, 0, 1]]
        System.out.println(Arrays.toString(solution(6)));
        // [[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]
        System.out.println(Arrays.toString(solution(1)));
        // [[1]]
    }
}
