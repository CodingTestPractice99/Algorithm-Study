package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            String str = s[0];
            int m = Integer.parseInt(s[1]);
            int z = Integer.parseInt(s[2]);

            String answer = str.substring(0, m) + str.substring(z);
            System.out.println(answer);
        }
    }
}
