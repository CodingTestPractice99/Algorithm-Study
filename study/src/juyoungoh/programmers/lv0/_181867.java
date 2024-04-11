package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181867 {

    public static int[] solution(String myString) {
        int[] answer = {};
        String[] str = myString.split("x");
        if (myString.endsWith("x")) {
            answer = new int[str.length + 1];
            for (int i = 0; i < str.length; i++) {
                answer[i] = str[i].length();
            }
            answer[str.length] = 0;
        } else {
            answer = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                answer[i] = str[i].length();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("oxooxoxxox"))); // 1, 2, 1, 0, 1, 0
        System.out.println(Arrays.toString(solution("xabcxdefxghi")));
    }
}
