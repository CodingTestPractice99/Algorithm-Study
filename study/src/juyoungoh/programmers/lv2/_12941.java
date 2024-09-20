package juyoungoh.programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _12941 {

    public static int solution(int[] A, int[] B) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            listA.add(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            listB.add(B[i]);
        }

        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);

        int sum = 0;
        for (int i = 0; i < listB.size(); i++) {
            sum += (listA.get(i) * listB.get(i));
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        System.out.println(solution(new int[]{1, 2}, new int[]{3, 4}));
    }
}
