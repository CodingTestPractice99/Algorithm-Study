package juyoungoh.programmers.lv0;

public class _181914 {

    public static int solution(String number) {
        int num = 0;

        for (int i = 0; i < number.length(); i++) {
            num += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return num % 9;
    }

    public static void main(String[] args) {
        System.out.println(solution("123")); // 6
        System.out.println(solution("78720646226947352489")); // 2
    }
}
