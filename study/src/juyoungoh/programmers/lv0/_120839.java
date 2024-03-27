package juyoungoh.programmers.lv0;

public class _120839 {
    public static String solution(String rsp) {
        String answer = "";
        char index[] = rsp.toCharArray();

        for (int i = 0; i < index.length; i++) {
            if (index[i] == '2') {
                answer += "0";
            } else if (index[i] == '0') {
                answer += "5";
            } else if (index[i] == '5') {
                answer += "2";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }
}
