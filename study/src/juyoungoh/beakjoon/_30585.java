package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30585 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);

        int zero = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                int s2 = Integer.parseInt(str[j]);
                if (s2 == 0) {
                    zero++;
                } else {
                    one++;
                }
            }
        }

        if (zero < one) {
            System.out.println(zero);
        } else if (zero > one) {
            System.out.println(one);
        } else {
            System.out.println(zero);
        }
    }
}
