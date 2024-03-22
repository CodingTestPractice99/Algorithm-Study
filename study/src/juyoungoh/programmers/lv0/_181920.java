package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181920 {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        int start = start_num;
        for (int i = 0; i < answer.length; i++) {
            answer[i] += start;
            start++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 10)));
    }
}
