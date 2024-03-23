package juyoungoh.programmers.lv0;

public class _181889 {

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int count = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i <= n - 1) {
                answer[count] += num_list[i];
                count++;
            } else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 2, 1, 7, 5}, 3));
    }
}
