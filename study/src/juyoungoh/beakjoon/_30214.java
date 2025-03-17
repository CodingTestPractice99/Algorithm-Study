package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30214 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = (int) Math.ceil(Integer.parseInt(s[1]) / 2.0);

        if (n < m) {
            System.out.println("H");
        } else {
            System.out.println("E");
        }
    }
}
