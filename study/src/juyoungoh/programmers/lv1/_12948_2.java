package juyoungoh.programmers.lv1;

public class _12948_2 {

    public static String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444")); // *******4444
        System.out.println(solution("027778888")); // *****8888
    }
}
