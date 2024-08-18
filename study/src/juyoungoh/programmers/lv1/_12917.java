package juyoungoh.programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _12917 {

    public static String solution(String s) {
        String answer = "";
        char c[] = s.toCharArray();
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {
            num.add(((int) c[i]));
        }

        Collections.sort(num);
        Collections.reverse(num);

        for (int i = 0; i < num.size(); i++) {
            answer += String.valueOf((char) num.get(i).intValue());
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
