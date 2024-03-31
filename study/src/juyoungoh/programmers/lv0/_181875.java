package juyoungoh.programmers.lv0;

public class _181875 {
    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
               answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"AAA", "BBB", "CCC", "DDD"}));
        System.out.println(solution(new String[]{"aBc", "AbC"}));
    }
}
