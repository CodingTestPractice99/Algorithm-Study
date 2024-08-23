package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _27434 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigInteger factorial = calculateFactorial(1, n);
        System.out.println(factorial);
    }

    public static BigInteger calculateFactorial(int a, int n) {
        BigInteger num = BigInteger.valueOf(a);
        if (a < n) {
            int b = (a + n) / 2;
            num = calculateFactorial(a, b).multiply(calculateFactorial(b + 1, n));
        }
        return num;
    }
}
