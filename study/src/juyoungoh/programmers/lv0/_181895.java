package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181895 {

    public static int[] solution(int[] arr, int[][] intervals) {
        int count = 0;
        int one = intervals[0][0];
        int two = intervals[0][1];
        int three = intervals[1][0];
        int four = intervals[1][1];

        int index1 = two - one + 1; // 3
        int index2 = four - three + 1; // 5

        int[] answer = new int[index1 + index2];

        for (int i = one; i <= two; i++) {
            answer[count] = arr[i];
            count++;
        }

        for (int i = three; i <= four; i++) {
            answer[count] = arr[i];
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})));
        // [2, 3, 4, 1, 2, 3, 4, 5]
    }
}
