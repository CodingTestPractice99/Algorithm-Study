package juyoungoh.programmers.lv0;

public class _181943 {

    public static String solution(String my_string, String overwrite_string, int s) {
        String oldStr = my_string.substring(s, (overwrite_string.length() + s));
        String answer = my_string.replaceFirst(oldStr, overwrite_string);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aaaaaa", "bbb", 3)); // aaabbb

        System.out.println(solution("He11oWor1d", "lloWorl", 2));
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }
}
