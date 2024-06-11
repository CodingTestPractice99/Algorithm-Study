package juyoungoh.programmers.lv0;

public class _181872 {
    public static String solution(String myString, String pat) {
        String answer = "";
        int index = myString.lastIndexOf(pat);
        answer = myString.substring(0, index + pat.length());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }
}
