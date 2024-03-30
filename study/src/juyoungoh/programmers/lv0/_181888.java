package juyoungoh.programmers.lv0;

public class _181888 {

    public static int[] solution(int[] num_list, int n) {
        int indexLength = 0;

        if (num_list.length % n != 0) {
            indexLength = (num_list.length / n) + 1;
        } else {
            indexLength = num_list.length / n;
        }

        int[] answer = new int[indexLength];

        answer[0] += num_list[0];

        for (int i = 1; i < answer.length; i++) {
            answer[i] += num_list[i * n];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7}, 1));
        System.out.println(solution(new int[]{4, 2, 6, 1, 7}, 2));
        System.out.println(solution(new int[]{4, 2, 6, 1, 7}, 4));
    }
}
