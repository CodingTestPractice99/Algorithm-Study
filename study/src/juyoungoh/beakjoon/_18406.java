package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _18406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = 0;
        int m = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            n += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = str.length() / 2; i < str.length(); i++) {
            m += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        if (n == m) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
