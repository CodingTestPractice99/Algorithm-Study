package juyoungoh.programmers.lv0;

public class _120853 {

    public static int solution(String s) {
        int answer = 0;
        String strArr[] = s.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("Z")) {
                answer += Integer.parseInt(strArr[i]);
            } else {
                answer -= Integer.parseInt(strArr[i - 1]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }
}
