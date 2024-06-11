package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120842 {

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int count = 0;

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }
}
