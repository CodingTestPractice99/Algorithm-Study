package juyoungoh.programmers.lv0;

public class _181930 {
    public static int solution(int a, int b, int c) {
        if (a == b && b == c && a == c) {
           return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
                            * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        } else if (a != b && b != c && a != c) {
           return a + b + c;
        } else {
            return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }
}
