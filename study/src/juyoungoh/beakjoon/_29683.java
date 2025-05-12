package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _29683 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[1]);

        int count = 0;
        for (int i = 0; i < s2.length; i++) {
            if (Integer.parseInt(s2[i]) / n >= 1) {
                count += Integer.parseInt(s2[i]) / n;
            }
        }
        System.out.println(count);
    }
}
