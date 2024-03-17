package juyoungoh.programmers.lv0;

public class _181879 {
    public static int solution(int[] num_list) {
        int add = 0;
        int multiplication = 1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                add += num_list[i];
            } else if (num_list.length <= 10) {
                multiplication *= num_list[i];
            }
        }
        if (add != 0) {
            return add;
        } else  {
            return multiplication;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(solution(new int[]{2, 3, 4, 5}));
    }
}
