package juyoungoh.programmers.lv1;

public class _12918_1 {

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }
}
