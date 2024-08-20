package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27433 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(multiplyNum(n));
    }

    public static long multiplyNum(long n) {
        long num = 1;

        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        return num;
    }
}
