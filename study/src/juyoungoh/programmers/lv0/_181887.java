package juyoungoh.programmers.lv0;

public class _181887 {

    public static int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 != 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }
        if (odd > even) {
            return odd;
        } else if (even > odd) {
            return even;
        } else if (even == odd) {
            return even;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(solution(new int[]{-1, 2, 5, 6, 3}));
    }
}
