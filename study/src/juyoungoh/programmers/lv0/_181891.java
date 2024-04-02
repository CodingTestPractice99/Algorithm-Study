package juyoungoh.programmers.lv0;

public class _181891 {

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int answerIndex = 0;
        int count = answerIndex;

        for (int i = n; i < num_list.length; i++) {
            answer[answerIndex] = num_list[i];
            answerIndex++;
        }

        for (int i = 0; i < num_list.length - count; i++) {
            if (answerIndex < answer.length) {
                answer[answerIndex] = num_list[i];
                answerIndex++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 2, 1, 7, 5}, 3)); // 7 5 5 2 1
    }
}
