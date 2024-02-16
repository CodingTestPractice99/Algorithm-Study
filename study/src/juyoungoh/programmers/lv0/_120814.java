package juyoungoh.programmers.lv0;

public class _120814 {

    public static int solution(int n) {
        int answer = 1;
        int piece = 7;

        if (piece / n >= 1) {
            return 1;
        } else {
            while (piece / n < 1) {
                piece += 7;
                answer++;
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        System.out.println(solution(7)); // 1
        System.out.println(solution(1)); // 1
        System.out.println(solution(15)); // 3
    }
}
