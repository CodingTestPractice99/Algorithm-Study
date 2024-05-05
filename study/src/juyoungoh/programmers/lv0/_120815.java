package juyoungoh.programmers.lv0;

public class _120815 {

    public static int solution(int n) {
        int six = 6;
        int count = 2;
        int pizza = 6;

        if (n == 6) {
            return 1;
        }

        while (pizza % n != 0) {
            pizza = six * count;
            count++;
        }

        return pizza / six;
    }

    public static void main(String[] args) {
        System.out.println(solution(6)); // 6명 - 1판
        System.out.println(solution(10)); // 10명 - 5판
        System.out.println(solution(4)); // 4명 - 2판
    }
}
