package juyoungoh.beakjoon;

import java.util.Scanner;

public class _2439_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= N; i++) { // 1, 2, 3, 4, 5
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
