package juyoungoh.programmers.lv0;

public class _120888 {

    public static String solution(String my_string) {
        String str = my_string;
        char c[] = str.toCharArray();
        String answer = "";

        for (int i = 0; i < c.length; i++) {
            if (!(answer.contains(String.valueOf(c[i])))) {
                answer += c[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }
}
