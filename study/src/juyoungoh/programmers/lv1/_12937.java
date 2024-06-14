package juyoungoh.programmers.lv1;

public class _12937 {
    public static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
}
