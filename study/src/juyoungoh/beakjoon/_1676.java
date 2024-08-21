package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(calculateFactorialZero(n));
    }

    public static int calculateFactorialZero(int n) {
        int count = 0;
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        String str = String.valueOf(result);

        for (int i = str.length() - 1; i > 0; i--) {
            if (String.valueOf(str.charAt(i)).equals("0")) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
