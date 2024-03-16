package juyoungoh.programmers.lv0;

public class _181937 {

    public static int solution(int num, int n) {
        if (num % n == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(98, 2));
        System.out.println(solution(34, 3));
    }
}
