package juyoungoh.programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class _181900 {

    public static String solution(String my_string, int[] indices) {
        String answer = "";
        int count = 0;

        ArrayList<String> str = new ArrayList<>();

        Arrays.sort(indices);

        int indices2[] = new int[indices.length];

        for (int i = indices2.length - 1; i >= 0; i--) {
            indices2[i] = indices[count];
            count++;
        }

        for (int i = 0; i < my_string.length(); i++) {
            str.add(String.valueOf(my_string.charAt(i)));
        }

        for (int i = 0; i < indices.length; i++) {
            str.remove(indices2[i]);
        }

        for (int i = 0; i < str.size(); i++) {
            answer += str.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}
