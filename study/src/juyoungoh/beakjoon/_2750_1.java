package juyoungoh.beakjoon;

import java.util.Scanner;

public class _2750_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection sort - 5, 4, 3, 2, 1
        for (int i = 0; i < N - 1; i++) { // 0, 1, 2, 3
            for (int j = i + 1; j < N; j++) { // 1, 2, 3, 4 // 2, 3, 4 // 3, 4 // 4
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
