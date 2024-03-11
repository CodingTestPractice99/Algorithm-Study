package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120811 {
    public static int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);

        if (array.length == 1) {
            return array[0];
        }

        int length = array.length / 2;
        for (int i = 0; i < array.length; i++) {
         answer = array[length];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(solution(new int[]{9, -1, 0}));
        System.out.println(solution(new int[]{0}));
    }
}
