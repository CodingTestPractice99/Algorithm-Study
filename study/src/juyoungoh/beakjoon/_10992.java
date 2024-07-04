package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10992 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) { // 행
            if (i + 1 == n) {
                for (int j = 1; j <= n * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else if (i + 1 < n) {
                for (int j = n; j > i + 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= i * 2 - 1; j++) { // 1, 3
                    System.out.print(" ");
                }
                if (i > 0) {
                    for (int j = 0; j < 1; j++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
