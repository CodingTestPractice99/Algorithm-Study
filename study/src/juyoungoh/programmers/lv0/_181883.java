package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181883 {

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length; j++) {

            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}})));
    }
}
