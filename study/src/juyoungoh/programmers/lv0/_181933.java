package juyoungoh.programmers.lv0;

public class _181933 {
    public static int solution(int a, int b, boolean flag) {
        if (flag) {
         return  a + b;
        } else {
            return a - b;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }
}
