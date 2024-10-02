package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181857_1 {

    public static int[] solution(int[] arr) {
        int len = arr.length;
        int pow = 0;

        while (len > Math.pow(2, pow)) {
            pow++;
        }
        int[] answer = new int[(int) Math.pow(2, pow)];
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89})));
    }
}
