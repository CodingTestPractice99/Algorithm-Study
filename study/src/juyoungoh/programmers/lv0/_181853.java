package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181853 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int[] num = Arrays.stream(num_list).sorted().toArray();

        for (int i = 0; i < 5; i++) {
             answer[i] += num[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, 1, 14}));
    }
}
