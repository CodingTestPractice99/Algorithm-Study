package juyoungoh.programmers.lv0;

public class _120848_2 {

    public static int solution(int n) {
        int factorial = 1;
        int num = 1;

        while (factorial < n) {
            factorial = factorial * num;
            num++;
            if (factorial == n) {
                return num - 1;
            } else if (factorial > n) {
                return num - 2;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(solution(24));
        System.out.println(solution(180));
        System.out.println(solution(7));
    }
}
