package juyoungoh.programmers.lv0;

public class _181905 {

    public static String solution(String my_string, int s, int e) {
        String answer = "";
        int count = 0;
        String str = my_string.substring(s, e + 1);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse().toString();

        for (int i = 0; i < my_string.length(); i++) {
            if (i >= s && i <= e) {
                answer += sb.charAt(count);
                count++;
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
        System.out.println(solution("Stanley1yelnatS", 4, 10));
        // Stanley1yelnatS
        // Stanley1yelnatS
    }
}
