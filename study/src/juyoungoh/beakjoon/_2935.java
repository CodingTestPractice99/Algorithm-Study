package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _2935 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String str = br.readLine();
        String m = br.readLine();

        BigInteger bigInteger1 = new BigInteger(n);
        BigInteger bigInteger2 = new BigInteger(m);

        if (str.equals("*")) {
            System.out.print(bigInteger1.multiply(bigInteger2));
        } else {
            System.out.print(bigInteger1.add(bigInteger2));
        }
    }
}
