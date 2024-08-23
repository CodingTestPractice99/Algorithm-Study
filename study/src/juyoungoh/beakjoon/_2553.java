package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2553 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(calculateFactorial(n));
    }

    public static int calculateFactorial(int n) {
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            answer *= i;
            while (answer % 10 == 0) {
                answer /= 10;
            }
            answer %= 100000;
        }
        return answer % 10;
    }
}
