package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1271 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");

        BigInteger bigInteger1 = new BigInteger(str[0]);
        BigInteger bigInteger2 = new BigInteger(str[1]);

        BigInteger divide = bigInteger1.divide(bigInteger2);
        BigInteger mod = bigInteger1.mod(bigInteger2);

        System.out.println(divide);
        System.out.println(mod);
    }
}
