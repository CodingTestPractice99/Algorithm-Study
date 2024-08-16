package juyoungoh.programmers.lv1;

public class _12943 {

    public static long solution(long num) {
        long number = num;
        long answer = 0;

        while (number > 1) {
            if (answer >= 500) {
                return -1;
            }
            if (number % 2 == 0) {
                number /= 2;
                answer++;
            } else {
                number *= 3;
                number += 1;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
}
