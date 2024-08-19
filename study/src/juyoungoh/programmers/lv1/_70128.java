package juyoungoh.programmers.lv1;

public class _70128 {

    public static long solution(int[] a, int[] b) {
        long answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
        System.out.println(solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1}));
    }
}
