package juyoungoh.programmers.lv0;

public class _181898 {
    public static int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 0, 1}, 1));
        System.out.println(solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
        System.out.println(solution(new int[]{1, 1, 1, 1, 0}, 3));
    }
}
