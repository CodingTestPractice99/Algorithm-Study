package juyoungoh.programmers.lv0;

public class _181904 {

    public static String solution(String my_string, int m, int c) {
        String answer = "";
        int m2 = m;
        int startNum = 0;
        int index = my_string.length() / m;
        String array[] = new String[index];
        for (int i = 0; i < index; i++) {
            array[i] = my_string.substring(startNum, m2);
            startNum += m;
            m2 += m;
        }

        for (int i = 0; i < array.length; i++) {
            answer += array[i].charAt(c - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(solution("programmers", 1, 1));
    }
}
