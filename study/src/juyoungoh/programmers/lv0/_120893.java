package juyoungoh.programmers.lv0;

public class _120893 {

    public static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else if (Character.isLowerCase(my_string.charAt(i))) {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }
}
