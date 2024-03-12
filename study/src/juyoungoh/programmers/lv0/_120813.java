package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120813 {

    public static int[] solution(int n) {
        int[] answer;
        if (n % 2 != 0) {
            answer = new int[n / 2 + 1];
        } else {
            answer = new int[n / 2];
        }

        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }
}
