package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181902 {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        char strArr[] = my_string.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] < 97) {
                answer[strArr[i] - 65] += 1;
            } else {
                answer[strArr[i] - 71] += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Programmers")));
    }
}
