package juyoungoh.programmers.lv0;

public class _181839 {

    public static int solution(int a, int b) {
        int answer = 0;

        if (a % 2 != 0 && b % 2 != 0) {
            return answer = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        } else if (a % 2 == 0 && b % 2 == 0) {
            if (a - b < 0) {
                answer = Math.abs(a - b);
            } else {
                answer = a - b;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5)); // 34
        System.out.println(solution(6, 1)); // 14
        System.out.println(solution(2, 4)); // 2
    }
}
