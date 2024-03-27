package juyoungoh.programmers.lv0;

public class _181928 {

    public static int solution(int[] num_list) {
        int answer = 0;

        String odd = "";
        String even = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }
}
