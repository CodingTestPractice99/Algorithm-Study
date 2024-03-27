package juyoungoh.programmers.lv0;

public class _120892 {
    public static String solution(String cipher, int code) {
        String answer = "";

        char index[] = cipher.toCharArray();
        for (int i = code; i < index.length + 1; i++) {
            if (i % code == 0) {
                answer += index[i - 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));

    }
}
