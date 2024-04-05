package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181885 {

    public static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int count = 0;
        int index = 0;

        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                count++;
            }
        }
        answer = new String[count];

        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},
                new boolean[]{true, false, true, false})));
    }
}
