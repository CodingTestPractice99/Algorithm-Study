package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120905 {
    public static int[] solution(int n, int[] numList) {
        int[] answer = new int[numList.length];
        int count = 0;

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % n == 0) {
                answer[count] += numList[i];
                count++;
            }
        }

        int array2[] = new int[count];
        int index2 = 0;

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % n == 0) {
                array2[index2] = numList[i];
                index2++;
            }
        }
        return array2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(solution(5, new int[]{1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(solution(12, new int[]{2, 100, 120, 600, 12, 12})));
    }
}
