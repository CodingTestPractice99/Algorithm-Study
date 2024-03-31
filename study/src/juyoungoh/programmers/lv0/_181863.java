package juyoungoh.programmers.lv0;

public class _181863 {
    public static String solution(String rny_string) {
        String answer = "";
        if (rny_string.contains("m")) {
             answer = rny_string.replace("m", "rn");
             return answer;
        } else {
            return rny_string;

        }
    }

    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
        System.out.println(solution("programmers"));
        System.out.println(solution("jerry"));
        System.out.println(solution("burn"));
    }
}
