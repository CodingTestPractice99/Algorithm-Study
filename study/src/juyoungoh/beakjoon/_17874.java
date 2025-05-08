package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int b2 = a - b;
        int c2 = a - c;

        int max1 = Math.max(b, b2);
        int max2 = Math.max(c, c2);

        System.out.println(max1 * max2 * 4);
    }
}
