package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17863 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");

        String s1 = s[0] + s[1] + s[2];

        if (s1.equals("555")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
