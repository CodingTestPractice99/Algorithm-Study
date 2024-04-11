package juyoungoh.programmers.lv0;

public class _120850 {
    public static int[] solution(String my_string) {
        int count = 0;
        int[] answer = {};

        char array[] = my_string.toCharArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(Integer.parseInt(String.valueOf(array[i])));

        }



        for (int i = 0; i < my_string.length(); i++) {

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hi12392"));
        System.out.println(solution("p2o4i8gj2"));
        System.out.println(solution("abcde0"));
    }
}
