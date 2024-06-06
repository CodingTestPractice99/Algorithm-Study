package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181909 {

    public static String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i, my_string.length());
        }

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("programmers")));
    }
}
