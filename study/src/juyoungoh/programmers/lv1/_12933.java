package juyoungoh.programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class _12933 {

    public static long solution(long n) {
        long answer = 0;
        String answerStr = "";
        String str = String.valueOf(n);

        ArrayList<Long> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            arr.add(Long.parseLong(String.valueOf(str.charAt(i))));
        }

        Collections.sort(arr);
        Collections.reverse(arr);

        for (int i = 0; i < arr.size(); i++) {
            answerStr += String.valueOf(arr.get(i));
        }

        answer = Long.parseLong(answerStr);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
