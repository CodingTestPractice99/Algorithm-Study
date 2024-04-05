package juyoungoh.programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _181844 {

    public static int[] solution(int[] arr, int[] delete_list) {
        int index = 0;
        int count = 0;
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    answer[i] -= delete_list[j];
                }
            }
        }
        int[] answer2 = {};
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                index++;
            }
        }
        answer2 = new int[arr.length - index];

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                answer2[count] = answer[i];
                count++;
            }
        }
        return answer2;
    }

    /**
     * 다른 사람의 풀이
     */
    public static int[] solution2(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            list.add(n);
        }
        for (int n : delete_list) {
            list.remove((Integer) n);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static int[] solution3(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(solution3(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43})));
    }
}
