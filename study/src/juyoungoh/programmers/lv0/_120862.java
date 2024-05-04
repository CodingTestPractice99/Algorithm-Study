package juyoungoh.programmers.lv0;

public class _120862 {

    public static int solution(int[] numbers) {
        int firstNum = 0;
        int secondNum = 0;
        int minusFirstNum = 0;
        int minusSecondNum = 0;
        int minusFirstIndex = 0;

        if (numbers.length == 2) {
            return numbers[0] * numbers[1];
        }

        for (int i = 0; i < numbers.length; i++) {
            if (minusFirstNum > numbers[i]) {
                minusFirstNum = numbers[i];
                minusFirstIndex = i;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (minusFirstNum <= numbers[i] && secondNum > numbers[i] && i != minusFirstIndex) {
                minusSecondNum = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (firstNum < numbers[i]) {
                firstNum = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (firstNum > numbers[i] && secondNum < numbers[i]) {
                secondNum = numbers[i];
            }
        }
        if ((firstNum * secondNum) > (minusFirstNum * minusSecondNum)) {
            return firstNum * secondNum;
        } else {
            return minusFirstNum * minusSecondNum;
        }
    }


    /**
     * -10,000 ≤ numbers의 원소 ≤ 10,000 2 ≤ numbers 의 길이 ≤ 100
     */
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 10})); // 100
        System.out.println(solution(new int[]{-1, 2, -3, 3}));
        System.out.println(solution(new int[]{0, 1, 2}));
        System.out.println(solution(new int[]{-2, -3, -4})); // 12
        System.out.println(solution(new int[]{-2, -2})); // 4
        System.out.println(solution(new int[]{-2, 1, -2})); // 4
        System.out.println(solution(new int[]{1, 2, -3, 4, -5})); // 15
        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9})); // 240
        System.out.println(solution(new int[]{10, 20, 30, 5, 5, 20, 5})); // 600
    }
}
