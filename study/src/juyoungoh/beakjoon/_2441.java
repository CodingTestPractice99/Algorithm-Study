package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2441 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String star = "*";
        String zero = " ";

        for (int i = 1; i <= n; i++) { // 행 1, 2, 3, 4, 5
            for (int j = 1; j < i; j++) {
                System.out.print(zero);
            }
            for (int j = n; j >= i; j--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
