package juyoungoh.programmers.lv0;

public class _181941 {

    public static String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }
}
