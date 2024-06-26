package juyoungoh.programmers.lv1;

public class _89051 {

    public static int solution(int[] numbers) {
        int sum = 0;
        int numSum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        for (int i = 0; i < numbers.length; i++) {
            numSum += numbers[i];
        }

        return sum - numSum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}
