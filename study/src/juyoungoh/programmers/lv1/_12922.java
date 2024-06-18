package juyoungoh.programmers.lv1;

public class _12922 {
    public static String solution(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer += su;
            } else {
                answer += bak;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
}
