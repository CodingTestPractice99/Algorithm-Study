package juyoungoh.programmers.lv0;

public class _181874 {

    public static String solution(String myString) {
        String answer1 = "";
        String answer2 = "";

        answer1 = myString.toLowerCase();
        answer2 = answer1.replace("a", "A");
        return answer2;
    }

    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
    }
}
