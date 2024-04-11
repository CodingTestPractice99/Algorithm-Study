package juyoungoh.programmers.lv0;

public class _120895 {

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer += my_string.charAt(num2);
            } else if (i == num2) {
                answer += my_string.charAt(num1);
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static String solution2(String my_string, int num1, int num2) {
        String answer = "";

        char c[] = my_string.toCharArray();

        c[num1] = my_string.charAt(num2);
        c[num2] = my_string.charAt(num1);

        answer = String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2("hello", 1, 2));
        System.out.println(solution("I love you", 3, 6));
    }
}
