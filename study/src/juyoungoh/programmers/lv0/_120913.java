package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120913 {

    public static String[] solution(String my_str, int n) {
        String[] answer = {};

        int index = 0;
        int n2 = n;
        int count = 0;

        if (my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];
        } else {
            answer = new String[(my_str.length() / n) + 1];
        }

        for (int i = 0; i < answer.length - 1; i++) {
            answer[i] = my_str.substring(index, n2);
            index = index + n;
            n2 = n2 + n2;
            count++;
        }

        answer[answer.length - 1] = my_str.substring(n * count);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcde12345", 5))); // ["abcde", "12345"]
        System.out.println(Arrays.toString(solution("abcdef123", 3))); // ["abc", "def", "123"]
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6))); // ["abc1Ad", "dfggg4", "556b"]
    }
}
