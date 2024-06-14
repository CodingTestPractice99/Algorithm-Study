package juyoungoh.programmers.lv0;

public class _120848 {

    public static int solution(int n) {
        int num = 1;
        int n2 = n;

        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            while (n2 >= 1) {
                if (n2 <= num * (num + 1))
                num = num * (num + 1);
            }
        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(solution(3628800)); // 10
        System.out.println(solution(7)); // 3
    }
}
