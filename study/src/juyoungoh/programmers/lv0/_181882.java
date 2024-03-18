package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181882 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[count] = arr[i] / 2;
                count++;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[count] = arr[i] * 2;
                count++;
            } else {
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98})));
    }
}
