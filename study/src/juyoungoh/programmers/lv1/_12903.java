package juyoungoh.programmers.lv1;

public class _12903 {
    public static String solution(String s) {
        if (s.length() == 1 || s.length() == 2) {
            return s;
        } else if (s.length() % 2 == 0) {
            int a = s.length() / 2 - 1;
            String str1 = String.valueOf(s.charAt(a));
            String str2 = String.valueOf(s.charAt(a+1));
            return str1 + str2;
        } else {
            int a = s.length() / 2;
            String str = String.valueOf(s.charAt(a));
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }
}
