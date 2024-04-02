package juyoungoh.programmers.lv0;

public class _181854 {

    public static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2}, 2));
        System.out.println(solution(new int[]{49, 12, 100, 276, 33}, 27)); // [76, 12, 127, 276, 60]
        System.out.println(solution(new int[]{444, 555, 666, 777}, 100)); // [444, 655, 666, 877]
    }
}
