package juyoungoh.programmers.lv0;

public class _181865 {

    public static int solution(String binomial) {
        int answer = 0;
        String array[] = binomial.split(" ");

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);

        if (array[1].equals("+")) {
            return a + b;
        } else if (array[1].equals("-")) {
            return a - b;
        } else if (array[1].equals("*")) {
            return a * b;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }
}
