package juyoungoh.programmers.lv1;

public class _12947 {

    public static boolean solution(int x) {
        String xStr = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < xStr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(xStr.charAt(i)));
        }

        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
}
