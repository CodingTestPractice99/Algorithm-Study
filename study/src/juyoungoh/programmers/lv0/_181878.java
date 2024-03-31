package juyoungoh.programmers.lv0;

public class _181878 {

    public static int solution(String myString, String pat) {
        String str = "";
        String patStr = "";

        str = myString.toLowerCase();
        patStr = pat.toLowerCase();

        if (str.contains(patStr)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc"));
        System.out.println(solution("aaAA", "aaaaa"));
    }
}
