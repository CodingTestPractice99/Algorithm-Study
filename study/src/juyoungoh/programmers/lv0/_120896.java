package juyoungoh.programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class _120896 {

    public static String solution(String s) {
        String answer = "";
        int count = 0;
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            str.add(String.valueOf(s.charAt(i)));
        }

        for (int i = 0; i < str.size(); i++) {
            for (int j = 0; j < str.size(); j++) {
                if (str.get(i).equals(str.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
                answer += str.get(i);
            }
            count = 0;
        }

        char[] charArray = answer.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcadc")); // d
        System.out.println(solution("abdc")); // abcd
        System.out.println(solution("hello")); // eho
    }
}
