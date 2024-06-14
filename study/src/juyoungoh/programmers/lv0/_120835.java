package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120835 {

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int em2[] = new int[emergency.length]; // 3, 24, 76

        int em3[] = new int[emergency.length];
        Arrays.sort(em2);

        int count = 0;

        for (int i = em2.length; i >= 1; i++) {

        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24}))); // 3, 1, 2
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }
}
