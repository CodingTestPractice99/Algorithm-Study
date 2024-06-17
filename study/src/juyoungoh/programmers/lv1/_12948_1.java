package juyoungoh.programmers.lv1;

public class _12948_1 {
    public static String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444")); // *******4444
        System.out.println(solution("027778888")); // *****8888
    }
}
