package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _26711 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        BigInteger bigInteger1 = new BigInteger(s1);
        BigInteger bigInteger2 = new BigInteger(s2);

        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println(add);
    }

}
