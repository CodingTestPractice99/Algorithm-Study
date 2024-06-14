package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120835_1 {

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) { // 0, 1, 2
            for (int j = 0; j < emergency.length; j++) { // 0, 1, 2
                if (emergency[i] <= emergency[j]) {
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24}))); // 3, 1, 2
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }
}
