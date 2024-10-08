package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _13277 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigInteger bigInteger = new BigInteger(st.nextToken());
        BigInteger bigInteger1 = new BigInteger(st.nextToken());

        System.out.println(bigInteger.multiply(bigInteger1));
    }
}
