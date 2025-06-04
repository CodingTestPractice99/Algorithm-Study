package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27262 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int d = Integer.parseInt(s[3]);

        int sum1 = (b - 1) * d;
        int sum2 = (a - 1) * d;

        int sum12 = sum1 + sum2;

        int sum3 = (a - 1) * c;

        System.out.println(sum12 + " " + sum3);
    }
}
