package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181912 {

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = new int[intStrs.length];
        int count = 0;
        int index = 0;

        for (int i = 0; i < intStrs.length; i++) {
            answer[i] = Integer.parseInt(intStrs[i].substring(s).substring(0, l));
        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] > k) {
                count++;
            }
        }

        int answer2[] = new int[count];

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] > k) {
                answer2[index] = answer[i];
                index++;
            }
        }
        return answer2;
    }

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(solution(new String[]{"0123456789", "9876543210", "9999999999999" }, 50000, 5, 5)));
    }
}
