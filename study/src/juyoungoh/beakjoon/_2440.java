package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2440 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String star = "*";

        for (int i = 0; i < n; i++) { // 0, 1, 2, 3, 4
            for (int j = n; j > i; j--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
