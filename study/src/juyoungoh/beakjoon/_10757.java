package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _10757 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");

        BigInteger a = new BigInteger(num[0]);
        BigInteger b = new BigInteger(num[1]);

        BigInteger sum = a.add(b);
        System.out.println(sum);
    }
}
