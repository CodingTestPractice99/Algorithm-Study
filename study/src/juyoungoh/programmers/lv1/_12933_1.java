package juyoungoh.programmers.lv1;

import java.util.Arrays;

public class _12933_1 {

    public static long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
