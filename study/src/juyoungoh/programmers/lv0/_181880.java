package juyoungoh.programmers.lv0;

public class _181880 {

    public static int solution(int[] num_list) {
        int answer = 0;
        int num = 0;
        for (int i = 0; i < num_list.length; i++) {
            num = num_list[i];
            while (num > 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    answer++;
                } else if (num % 2 != 0) {
                    num = (num - 1) / 2;
                    answer++;
                }
            }
            num = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 1, 14}));
    }
}
