package juyoungoh.programmers.lv1;

public class _12934 {

    public static long solution(long n) {
        long answer = -1;
        for (int i = 0; i <= n; i++) {
            long num = (long) Math.pow(i, 2);
            if (num == n) {
                answer = (long) Math.pow(i + 1, 2);
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(121));
        System.out.println(solution(3));
    }
}
