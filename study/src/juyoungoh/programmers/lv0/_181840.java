package juyoungoh.programmers.lv0;

public class _181840 {
    public static int solution(int[] num_list, int n) {
        int contains = 0;
        int notContains = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                contains++;
            } else {
                notContains = 0;
            }
        }

        if (contains > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(solution(new int[]{15, 98, 23, 2, 15}, 20));
    }
}
