package juyoungoh.programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class _77884 {

    public static int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                list.add(i);
            } else {
                list.add(-i);
            }
            count = 0;
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }
}
