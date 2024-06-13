package juyoungoh.programmers.lv0;

public class _120848_1 {

    public static int solution(int n) {
        int answer = 0;
        int factorial = 1;

        for (int i = 1; i <= 10; i++) {
            factorial *= i;
            if (factorial == n) {
                 answer = i;
                return answer;
            } else if (n < factorial) {
                answer = (i - 1);
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3628800)); // 10
        System.out.println(solution(7)); // 3
    }
}