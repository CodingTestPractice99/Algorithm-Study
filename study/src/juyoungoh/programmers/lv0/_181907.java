package juyoungoh.programmers.lv0;

public class _181907 {
    public static String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
        System.out.println(solution("He110W0r1d", 5));
    }
}
