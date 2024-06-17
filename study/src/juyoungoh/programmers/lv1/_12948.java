package juyoungoh.programmers.lv1;

public class _12948 {
    public static String solution(String phone_number) {
        String answer = "";
        int index = phone_number.length() - 4;

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < index) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }
}
