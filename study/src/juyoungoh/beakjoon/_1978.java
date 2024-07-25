package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        String str[] = input2.split(" ");

        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            BigInteger bigInteger = new BigInteger(str[i]);
            if (bigInteger.isProbablePrime(100)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
