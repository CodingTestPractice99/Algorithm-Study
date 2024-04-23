package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120911 {

    public static String solution(String my_string) {
        String str = my_string.toLowerCase();
        char a[] = str.toCharArray();
        Arrays.sort(a);

        String answer = "";
        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }
}
