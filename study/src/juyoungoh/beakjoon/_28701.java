package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28701 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        long sum = 0;
        long sum2 = 0;

        for (int j = 1; j <= num; j++) {
            sum += j;
        }

        sum2 = (long) Math.pow(sum, 2);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum2);
    }
}
