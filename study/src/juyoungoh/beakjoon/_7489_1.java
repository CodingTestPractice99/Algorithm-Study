package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7489_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int answer = calculateNonZeroDigit(n);
            System.out.println(answer);
        }
    }

    public static int calculateNonZeroDigit(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            while (result % 10 == 0) {
                result /= 10;
            }
            result %= 100000;
        }
        return result % 10;
    }
}
