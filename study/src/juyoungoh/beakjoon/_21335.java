package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21335 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        double radius = Math.sqrt(n / Math.PI);
        double circumference = 2 * Math.PI * radius;

        System.out.printf("%.9f\n", circumference);
    }
}
