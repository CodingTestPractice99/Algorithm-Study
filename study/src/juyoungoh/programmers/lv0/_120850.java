package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120850 {

    public static int[] solution(String my_string) {
        String arr[] = my_string.replaceAll("[^0-9]", "").split("");
        int answer[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] += Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }
}
