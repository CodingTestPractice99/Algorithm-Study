package juyoungoh.programmers.lv0;

public class _120844 {

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (direction.equals("right")) {
                answer[0] = numbers[numbers.length - 1];
                if (i > 0) {
                    answer[i] = numbers[count];
                    count++;
                }
            } else if (direction.equals("left") && i <= numbers.length - 2) {
                answer[answer.length - 1] = numbers[0];
                    answer[i] = numbers[i + 1];
                }
            }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, "right")); // 3, 1, 2
        System.out.println(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"));
    }
}
