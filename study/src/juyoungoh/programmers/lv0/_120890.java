package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120890 {

    // 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.

    public static int solution(int[] array, int n) {
        int answer = 0;
        int arr[] = new int[array.length + 1];
        Arrays.sort(array);

        for (int i = 0; i < arr.length; i++) {

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
        System.out.println(solution(new int[]{10, 11, 12}, 13));
    }
}
