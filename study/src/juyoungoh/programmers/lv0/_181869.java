package juyoungoh.programmers.lv0;

public class _181869 {

    public static String[] solution(String my_string) {
        String answer[] = my_string.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("i love you"));
        System.out.println(solution("programmers"));
    }
}
