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

    /**
     * 다른 사람의 풀이
     */
    public static String[] solution2(String[] todo_list, boolean[] finished) {
        String str = "";
        for (int i = 0; i < finished.length; i++) {
            str = finished[i] == false ? str + todo_list[i] + "," : str;
        }
        return str.split(",");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            solution2(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},
                new boolean[]{true, false, true, false})));
    }
}
