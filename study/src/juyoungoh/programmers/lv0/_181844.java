package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181844 {

    public static int[] solution(int[] arr, int[] delete_list) {
        int index = 0;
        int count = 0;
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    answer[i] -= delete_list[j];
                }
            }
        }
        int[] answer2 = {};
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                index++;
            }
        }
        answer2 = new int[arr.length - index];

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                answer2[count] = answer[i];
                count++;
            }
        }
        return answer2;
    }


    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43})));
    }
}
