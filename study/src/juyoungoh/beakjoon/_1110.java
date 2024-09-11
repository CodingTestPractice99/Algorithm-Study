package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = n;
        int count = 0;

        do {
            int ten = n / 10;
            int one = n % 10;
            int sum = ten + one;
            n = (one * 10) + (sum % 10);
            count++;
        } while (n != m);

        System.out.println(count);
    }
}
