package juyoungoh.programmers.lv0;

public class _120838 {

    public static String solution(String letter) {
        String morse[] = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };

        String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z" };

        String answer = "";

        String str[] = letter.split(" ");

        for (int j = 0; j < str.length; j++) {
            for (int i = 0; i < morse.length; i++) {
                if (str[j].equals(morse[i])) {
                    answer += alphabet[i];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        System.out.println(solution(".--. -.-- - .... --- -."));
    }
}
