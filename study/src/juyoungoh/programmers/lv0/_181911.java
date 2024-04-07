package juyoungoh.programmers.lv0;

public class _181911 {

    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int zero = 0;
        int one = 1;
        for (int k = 0; k < parts.length; k++) { // 0, 1, 2, 3
            answer += my_strings[k].substring(parts[k][zero], (parts[k][one]) + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] myStrings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(solution(myStrings, parts));
    }
}
