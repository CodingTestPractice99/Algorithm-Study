package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5692 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            } else {
                long sum = 0;

                for (int i = str.length(); i > 0; i--) {
                    long number = Long.parseLong(String.valueOf(str.charAt(num++)));
                    long answer = number * calculateFactorial(i);
                    sum += answer;
                }
                System.out.println(sum);
                num = 0;
            }
        }
    }

    public static long calculateFactorial(long n) {
        long num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        return num;
    }
}
