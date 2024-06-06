package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181866 {

    public static String[] solution(String myString) {
        String answer[] = myString.split("x");
        int count = 0;
        int index = 0;

        for (int i = 0; i < answer.length; i++) {
            if (answer[i].isBlank()) {
                count++;
            }
        }

        String answer2[] = new String[answer.length - count];

        for (int i = 0; i < answer.length; i++) {
            if (!(answer[i].isBlank())) {
                answer2[index] = answer[i];
                index++;
            }
        }
        Arrays.sort(answer2);
        return answer2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("dxccxbbbxxaaaa")));
        System.out.println(Arrays.toString(solution("axbxcxdx")));
        System.out.println(Arrays.toString(solution("dxccxbbbxaaaa")));
    }
}
