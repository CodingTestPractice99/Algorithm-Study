package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28519 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int min = Math.min(n, m);
        int max = Math.max(n, m);

        if (max - min > 1) {
            System.out.println(2 * min + 1);
        } else {
            System.out.println(n + m);
        }
    }
}
