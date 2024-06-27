package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2444 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // (2 * N) - 1
        int count = num * 2;
        for (int i = 1; i <= num; i++) { // 1, 2, 3, 4, 5
            for (int j = num; j > i; j--) { // 4, 3, 2, 1
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= num - 1; i++) { // 행 // 1, 2, 3, 4
            for (int j = 0; j < i; j++) { // 1, 2, 3, 4
                System.out.print(" ");
            }
            for (int j = count - 3; j > 0; j--) { // 7, 5, 3, 1
                System.out.print("*");
            }
            count -= 2;
            System.out.println();
        }
    }
}

