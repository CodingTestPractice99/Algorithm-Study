package juyoungoh.programmers.lv0;

public class _181834 {

    public static String solution(String myString) {
        String answer = "";
        String abcd = "abcdefghijk";
        String abc[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
        for (int i = 0; i < myString.length(); i++) {
            if (abcd.contains(String.valueOf(myString.charAt(i)))) {
                answer += "l";
            } else {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz")); // lllllvwxyz
        System.out.println(solution("jjnnllkkmm")); // llnnllllmm
    }
}
