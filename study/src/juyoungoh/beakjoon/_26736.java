package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26736 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");

        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("A")) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(a + " : " + b);
    }
}
