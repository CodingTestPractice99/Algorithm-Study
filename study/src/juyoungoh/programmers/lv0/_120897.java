package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120897 {

    public static int[] solution(int n) {
        int count = 0;
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] answer = new int[count];

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
        System.out.println(Arrays.toString(solution(29)));
    }
}
