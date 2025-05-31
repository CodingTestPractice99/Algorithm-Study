package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31048 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int result = 1;
            int n2 = Integer.parseInt(br.readLine());
            for (int j = 1; j <= n2; j++) {
                result *= j;
            }
            System.out.println(result % 10);
        }
    }
}
