package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26741 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        long x = Long.parseLong(s[0]);
        long y = Long.parseLong(s[1]);

        long b = (y - 2 * x) / 2;
        long a = x - b;

        System.out.println(a + " " + b);
    }
}
