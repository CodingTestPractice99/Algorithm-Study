package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181861 {

    public static int[] solution(int[] arr) {
        int count = 0;

        int[] answer = {};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                count++;
            }
            answer = new int[count];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 1, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 6})));
        System.out.println(Arrays.toString(solution(new int[]{1})));
    }
}
