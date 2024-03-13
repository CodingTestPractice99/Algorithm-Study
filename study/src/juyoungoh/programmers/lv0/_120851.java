package juyoungoh.programmers.lv0;

public class _120851 {

    public static boolean isInteger(char number) {
        try {
            Integer.parseInt(String.valueOf(number));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int solution(String my_string) {
        int answer = 0;
        char[] number = my_string.toCharArray();

        for (int i = 0; i < my_string.length(); i++) {
            if (isInteger(number[i])) {
                answer += Integer.parseInt(String.valueOf(number[i]));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }
}
