package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27310 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");

        int answer = s.length;
        int a = 0;
        int b = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(":")) {
                a++;
            } else if (s[i].equals("_")) {
                b++;
            }
        }
        System.out.println(answer + a + b * 5);
    }
}
