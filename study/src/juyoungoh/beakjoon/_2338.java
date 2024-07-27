package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _2338 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);

        StringBuilder sb = new StringBuilder();
        sb.append(bigA.add(bigB)).append("\n").append(bigA.subtract(bigB)).append("\n").append(bigA.multiply(bigB));

        System.out.print(sb);
    }
}
