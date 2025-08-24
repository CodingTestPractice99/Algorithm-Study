package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31822 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");
        String s1 = s[0] + s[1] + s[2] + s[3] + s[4];

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s2[] = br.readLine().split("");
            String s3 = s2[0] + s2[1] + s2[2] + s2[3] + s2[4];
            if (s3.contains(s1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
