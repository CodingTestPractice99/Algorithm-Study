package juyoungoh.programmers.lv0;

public class _181835 {

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 0) {
                answer[i] = arr[i] + k;
            } else {
                answer[i] = arr[i] * k;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}, 3));
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}, 2));
    }

}
