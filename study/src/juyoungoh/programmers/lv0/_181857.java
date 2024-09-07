package juyoungoh.programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _181857 {

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int len[] = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

        int length = 0;
        for (int i = 0; i < len.length; i++) {
            if (list.size() == len[i]) {
                return arr;
            } else if (list.size() < len[i]) {
                length = len[i] - list.size();
                break;
            }
        }

        for (int i = 0; i < length; i++) {
            list.add(0);
        }
        int answer[] = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89})));
    }
}
