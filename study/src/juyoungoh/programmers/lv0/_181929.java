package juyoungoh.programmers.lv0;

public class _181929 {
    public static int solution(int[] num_list) {
        int multiplication = 1;
        double square = 0;
        int add = 0;

        for (int i = 0; i < num_list.length; i++) {
                multiplication *= num_list[i];
            }

        for (int i = 0; i < num_list.length; i++) {
                add += num_list[i];
            }

         square = Math.pow(add, 2);

        if (square > multiplication) {
            return 1;
        } else  {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(solution(new int[] {5, 7, 8, 3}));
    }
}
