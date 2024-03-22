package juyoungoh.programmers.lv0;

public class _181910 {

    public static String solution(String my_String, int n) {
        String answer = my_String.substring(my_String.length() - n, my_String.length());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
        System.out.println(solution("He110W0r1d", 5));
    }
}
