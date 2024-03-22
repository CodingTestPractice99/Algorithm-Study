package juyoungoh.programmers.lv0;

public class _181938 {
    public static int solution(int a, int b) {
        int answer = 0;
        int firstResult = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int secondResult = 2 * a * b;
        if (firstResult > secondResult || firstResult == secondResult) {
            return firstResult;
        } else {
            return secondResult;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }
}
