package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10996 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int number = 0;
        int number2 = n / 2;

        if (n % 2 != 0) {
            number = n / 2 + 1;
        } else {
            number = n / 2;
        }

        if (n == 1) {
            System.out.println("*");
        } else {
            for (int i = 1; i <= n * 2; i++) { // 헹
                if (i % 2 != 0) {
                    for (int j = 1; j <= number; j++) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("*");
                        }
                        for (int k = 0; k < 1; k++) {
                            System.out.print(" ");
                        }
                    }
                } else {
                    for (int j = 1; j <= number2; j++) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < 1; k++) {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
