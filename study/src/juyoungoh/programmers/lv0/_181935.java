package juyoungoh.programmers.lv0;

public class _181935 {

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0 && i % 2 == 0) {
              answer += Math.pow(i, 2);
            } else if (n % 2 != 0 && i % 2 == 1) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(10));
        System.out.println(solution(1));
    }
}
