package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31616 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("");
        String str = s[0];
        int m = 0;

        for (int i = 1; i < s.length; i++) {
            if (str.equals(s[i])) {
                continue;
            } else {
               m = 1;
            }
        }

        if (m == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
