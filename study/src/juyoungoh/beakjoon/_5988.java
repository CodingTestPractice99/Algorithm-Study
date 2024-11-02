package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _5988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger bigInteger = new BigInteger("2");
        BigInteger zero = new BigInteger("0");

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            BigInteger input = new BigInteger(str);

            if (input.remainder(bigInteger).equals(zero)) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
