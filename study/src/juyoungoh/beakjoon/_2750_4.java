package juyoungoh.beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2750_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 정렬 메소드
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
