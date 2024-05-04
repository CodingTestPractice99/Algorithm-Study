package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120862_1 {
    public static int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 10})); // 100
        System.out.println(solution(new int[]{-1, 2, -3, 3}));
        System.out.println(solution(new int[]{0, 1, 2}));
        System.out.println(solution(new int[]{-2, -3, -4})); // 12
        System.out.println(solution(new int[]{-2, -2})); // 4
        System.out.println(solution(new int[]{-2, 1, -2})); // 4
        System.out.println(solution(new int[]{1, 2, -3, 4, -5})); // 15
        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9})); // 240
        System.out.println(solution(new int[]{10, 20, 30, 5, 5, 20, 5})); // 600
    }
}
