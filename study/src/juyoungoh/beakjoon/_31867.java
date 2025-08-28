package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31867 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int odd = 0;
        int even = 0;
        String s[] = br.readLine().split("");

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(s[i]) % 2 == 0) {
                even++;
            } else  {
                odd++;
            }
        }

        if (odd < even) {
            System.out.println(0);
        } else if (odd > even) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
