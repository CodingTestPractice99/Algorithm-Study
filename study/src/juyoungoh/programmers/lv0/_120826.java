package juyoungoh.programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120826 {

    public static String solution(String my_string, String letter) {
        String array[] = my_string.split("");

        int n = 0;

        String arrays[] = new String[array.length - n];
        String answer = "";

        for (int i = 0; i < array.length; i++) {
            if (!(array[i].equals(letter))) {
                arrays[i] = array[i];
                n++;
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != null) {
                answer += arrays[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
    }
}
