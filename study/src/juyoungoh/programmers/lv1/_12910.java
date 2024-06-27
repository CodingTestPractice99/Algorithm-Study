package juyoungoh.programmers.lv1;

import java.util.Arrays;

public class _12910 {

    public static int[] solution(int[] arr, int divisor) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        int index = 0;

        if (count == 0) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = new int[count];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[index] = arr[i];
                    index++;
                }
            }
            Arrays.sort(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 6}, 10)));
    }
}
