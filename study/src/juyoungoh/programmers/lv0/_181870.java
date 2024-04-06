package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181870 {

    public static String[] solution(String[] strArr) {
        String[] answer = {};
        int index = 0;
        int arrIndex = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (!(strArr[i].contains("ad"))) {
                index++;
            }
        }

        answer = new String[index];

        for (int i = 0; i < strArr.length; i++) {
            if (!(strArr[i].contains("ad"))) {
                answer[arrIndex] = strArr[i];
                arrIndex++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"and", "notad", "abcd"})));
        System.out.println(Arrays.toString(solution(new String[]{"there", "are", "no", "a", "ds"})));
    }
}
