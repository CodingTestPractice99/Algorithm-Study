package juyoungoh.programmers.lv1;

public class _12931 {
    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
}
