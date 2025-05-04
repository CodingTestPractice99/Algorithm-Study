package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _32902 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        int min = n + 1;
        int max = k * n + 1;
        System.out.println(min + " " + max);
    }
}
