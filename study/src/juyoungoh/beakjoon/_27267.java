package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int m = Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
        int p = Integer.parseInt(s[2]) * Integer.parseInt(s[3]);

        if (m > p) {
            System.out.println("M");
        } else if (m < p) {
            System.out.println("P");
        } else {
            System.out.println("E");
        }
    }
}
