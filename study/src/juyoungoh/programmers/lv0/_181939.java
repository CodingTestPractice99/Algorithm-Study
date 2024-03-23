package juyoungoh.programmers.lv0;

public class _181939 {
    public static int solution(int a, int b) {
        int firstAnswer = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int secondAnswer = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        if (firstAnswer > secondAnswer || firstAnswer == secondAnswer) {
            return firstAnswer;
        } else {
            return secondAnswer;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(9, 91));
        System.out.println(solution(89, 8));
    }
}
