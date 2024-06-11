package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120842_1 {

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;
        answer = new int[length / n][n];

        for (int i = 0; i < length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }
}
