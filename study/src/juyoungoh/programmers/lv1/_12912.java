package juyoungoh.programmers.lv1;

public class _12912 {

    public static long solution(int a, int b) {
        long answer = 0;
        int min = 0;
        int max = 0;

        if (a > b) {
            max = a;
            min = b;
        } else if (a < b) {
            max = b;
            min = a;
        } else {
            return a;
        }

        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }
}
