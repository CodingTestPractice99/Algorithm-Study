package juyoungoh.programmers.lv0;

public class _120899 {

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 8, 3}));
        System.out.println(solution(new int[]{9, 10, 11, 8}));
    }
}
