package juyoungoh.programmers.lv0;

public class _120887_1 {

    public static int solution(int i, int j, int k) {
        String str = "";
        for (int a = i; a <= j; a++) {
            str += a + "";
        }

        return str.length() - str.replace(k + "", "").length();
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }
}
