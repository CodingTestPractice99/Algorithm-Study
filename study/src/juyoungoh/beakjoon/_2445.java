package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2445 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) { // 행 1, 2, 3, 4, 5
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = n * 2 - 1; j > i * 2 - 1; j--) { // 8, 6, 4, 2, 0
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) { // 행 1, 2, 3, 4
            for (int j = n; j > i; j--) { // 4, 3, 2, 1
                System.out.print("*");
            }
            for (int j = 1; j <= i * 2; j++) { // 2, 4, 6, 8
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) { // 4, 3, 2, 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
