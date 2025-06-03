package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33964 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        String n2 = "";
        String m2 = "";

        for (int i = 0; i < n; i++) {
            n2 += "1";
        }

        for (int i = 0; i < m; i++) {
            m2 += "1";
        }

        System.out.println(Integer.parseInt(n2) + Integer.parseInt(m2));
    }
}
