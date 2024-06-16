package juyoungoh.programmers.lv1;

import java.util.Arrays;

public class _12932 {

    public static int[] solution(long n) {
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];

        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            answer[count] = Integer.parseInt(String.valueOf(str.charAt(i)));
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

}
