package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26307 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int h2 = h - 9;
        int answer = h2 * 60 + m;
        System.out.println(answer);
    }
}
