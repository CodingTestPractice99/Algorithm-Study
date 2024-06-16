package juyoungoh.programmers.lv1;

public class _12931_1 {

    public static int solution(int n) {
        int answer = 0;
        while (true) {
            answer += n % 10;
            if (n < 10) {
                break;
            }
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
    }
}
