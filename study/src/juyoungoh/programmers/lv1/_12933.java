package juyoungoh.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _12933 {

    public static long solution(long n) {
        long answer = 0;
        String answer2 = "";
        String str = String.valueOf(n);
        long arr2[] = new long[str.length()];
        ArrayList<Long> arr = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Long.parseLong(String.valueOf(str.charAt(i)));
        }

        for (int i = 0; i < arr2.length; i++) {
            arr.add(arr2[i]);
        }

        Arrays.sort(arr2);
        Collections.sort(arr);
        Collections.reverse(arr);

        for (int i = 0; i < arr.size(); i++) {
            answer2 += String.valueOf(arr.get(i));
        }

        answer = Long.parseLong(answer2);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
