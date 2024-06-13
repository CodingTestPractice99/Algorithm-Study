package juyoungoh.programmers.lv0;

public class _120848_3 {

    public static int solution(int n) {
        int fac = 1;
        int i = 0;

        while (true) {
            if (fac <= n) {
                fac *= i + 1;
                i++;
            } else {
                break;
            }
        }
        return i - 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
    }
}
