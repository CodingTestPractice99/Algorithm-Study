package juyoungoh.programmers.lv0;

public class _120809 {
    public static int[] solution(int[] numbers) {
        int answer[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = 2 * numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
    }

}
