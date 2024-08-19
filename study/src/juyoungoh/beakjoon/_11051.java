package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _11051 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s[] = str.split(" ");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        BigInteger nFactorial = bigIntegerMultiply(n);
        BigInteger kFactorial = bigIntegerMultiply(k);
        BigInteger nMinusKFactorial = bigIntegerMultiply(n - k);

        BigInteger result = nFactorial.divide(kFactorial.multiply(nMinusKFactorial));

        BigInteger mod = new BigInteger("10007");
        BigInteger answer = result.mod(mod);
        System.out.println(answer);
    }

    public static BigInteger bigIntegerMultiply(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
