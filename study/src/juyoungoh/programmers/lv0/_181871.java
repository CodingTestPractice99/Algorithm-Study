package juyoungoh.programmers.lv0;

public class _181871 {

    public static int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (pat.length() + i <= myString.length()) {
                if (myString.substring(i, pat.length() + i).equals(pat)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana")); // 2
        System.out.println(solution("aaaa", "aa")); // 3
        System.out.println(solution("baa", "aa")); // 1
    }
}
