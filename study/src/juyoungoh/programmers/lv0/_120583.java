package juyoungoh.programmers.lv0;

public class _120583 {
    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1)); // 2
        System.out.println(solution(new int[]{0, 2, 3, 4}, 1)); // 0
    }
}
