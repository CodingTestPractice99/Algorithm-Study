package juyoungoh.programmers.lv0;

public class _181892 {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int count = 0;

        for (int i = n - 1; i < num_list.length; i++) {
             answer[count] = num_list[i];
             count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 6}, 3));
        System.out.println(solution(new int[]{5, 2, 1, 7, 5}, 2));
    }

}
