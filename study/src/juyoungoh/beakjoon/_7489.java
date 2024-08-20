package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7489 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int answer = calculateFactorial(n);
            System.out.println(answer);
        }
    }

    public static int calculateFactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;

            // 0 을 만드는 10을 제거
            while (result % 10 == 0) {
                result /= 10;
            }
            result %= 100000;
        }
        return result % 10;
    }
}
