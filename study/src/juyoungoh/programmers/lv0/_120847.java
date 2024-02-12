package juyoungoh.programmers.lv0;

public class _120847 {

    public static int solution(int[] numbers) {
        int firstMax = 0;
        int secondMax = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[numbers.length - 1]) {
                index++;
            }
            if (index == numbers.length) {
                return numbers[i] * numbers[numbers.length - 1];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (firstMax < numbers[i]) {
                firstMax = numbers[i];
            }

            for (int number : numbers) {
                if (firstMax > number && secondMax < number) {
                    secondMax = number;
                }
            }
        }
        int answer = firstMax * secondMax;
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
        System.out.println(solution(new int[]{1, 1, 1, 1, 1, 1})); // 1
    }
}

