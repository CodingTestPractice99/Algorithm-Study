package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181852 {
    public static int[] solution(int[] num_list) {
        int[] sortArrays = Arrays.stream(num_list).sorted().toArray();
        int[] answer = new int[num_list.length - 5];

        int count = 0;
        for (int i = 5; i < sortArrays.length; i++) {
            answer[count] += sortArrays[i];
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }
}
