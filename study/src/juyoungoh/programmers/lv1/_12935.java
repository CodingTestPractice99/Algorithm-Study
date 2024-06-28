package juyoungoh.programmers.lv1;

import java.util.Arrays;

public class _12935 {

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = new int[arr.length - 1];
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!(min == arr[i])) {
                    answer[count] = arr[i];
                    count++;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
    }
}
