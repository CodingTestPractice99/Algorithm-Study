package juyoungoh.programmers.lv0;

public class _181925 {

    public static String solution(int[] numLog) {
        String answer = "";

        for (int i = 0; i < numLog.length - 1; i++) {
            if (numLog[i] == numLog[i+1] - 1) {
                answer += "w";
            } else if (numLog[i] == numLog[i+1] + 1) {
                answer += "s";
            } else if (numLog[i] == numLog[i+1] - 10) {
                answer += "d";
            } else if (numLog[i] == numLog[i+1] + 10) {
                answer += "a";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
        // wsdawsdassw
    }
}
