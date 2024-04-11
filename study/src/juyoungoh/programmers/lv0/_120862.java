package juyoungoh.programmers.lv0;

public class _120862 {
    public static int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                count++;
            }
        }

        if (count )
        for (int i = 0; i < numbers.length; i++) {

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, -3, 4, -5}));
        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9}));
    }
}
