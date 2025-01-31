package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _20254 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]) * 56;
        int b = Integer.parseInt(s[1]) * 24;
        int c = Integer.parseInt(s[2]) * 14;
        int d = Integer.parseInt(s[3]) * 6;

        System.out.println(a + b + c + d);
    }
}
