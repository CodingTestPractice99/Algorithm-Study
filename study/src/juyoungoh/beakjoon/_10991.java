package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10991 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) { // 행
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                extracted();
            }
            System.out.println();
        }
    }

    private static void extracted() {
        for (int j = 0; j < 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 1; j++) {
            System.out.print("*");
        }
    }
}
