package juyoungoh.programmers.lv0;

import java.util.ArrayList;

public class _120846 {
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> count = new ArrayList();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    answer++;
                }
            }
            if (answer >= 3) {
                count.add(1);
            }
            answer = 0;
        }
        return count.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }
}
