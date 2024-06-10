package juyoungoh.programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class _181912_1 {

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (tmp > k) {
                list.add(tmp);
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(solution(new String[]{"0123456789", "9876543210", "9999999999999" }, 50000, 5, 5)));
    }
}
