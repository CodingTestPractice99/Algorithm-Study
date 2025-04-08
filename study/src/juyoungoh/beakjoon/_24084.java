package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24084 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("");

        for (int i = 0; i < s.length; i++) {
            if (s.length - 1 > i) {
                if (s[i + 1].equals("J")) {
                    System.out.println(s[i]);
                }
            }
        }
    }
}
