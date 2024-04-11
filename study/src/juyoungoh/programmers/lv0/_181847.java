package juyoungoh.programmers.lv0;

public class _181847 {

    public static String solution(String n_str) {
        String answer = "";
        int index = 0;

        if (n_str.startsWith("0")) {
            for (int i = 0; i < n_str.length(); i++) {
                if (n_str.charAt(index) == '0') {
                    index++;
                    continue;
                }
                answer += n_str.charAt(i);
            }
            return answer;
        } else {
            return n_str;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }
}
