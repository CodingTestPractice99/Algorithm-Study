package juyoungoh.programmers.lv0;

public class _120836 {
    public static int solution(int inputNumber) {
        int count = 0;

        for (int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(20)); // (1, 20), (2, 10), (4, 5), (5, 4), (10, 2), (20, 1)
        System.out.println(solution(100)); // (1, 100), (2, 50), (4, 25), (5, 20), (10, 10), (20, 5), (25, 4), (50, 2), (100, 1)
    }
}
