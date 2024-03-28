package juyoungoh.programmers.lv0;

public class _181849 {
    public static int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }
}
