package juyoungoh.programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class _181860 {

    public static int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    arr1.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    arr1.remove(arr1.size() - 1);
                }
            }
        }

        int[] intArray = new int[arr1.size()];

        for (int i = 0; i < arr1.size(); i++) {
            intArray[i] = arr1.get(i);
        }
        return intArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false})));
    }
}
