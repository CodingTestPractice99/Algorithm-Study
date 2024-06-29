package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2446 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) { // 1, 2, 3, 4, 5
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n * 2; j > i * 2 - 1; j--) { // 9, 7, 5, 3, 1
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) { // 행 2, 3, 4, 5
            for (int j = n - 1; j > i - 1; j--) { // 3, 2, 1
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) { // 3, 5, 7, 9
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
