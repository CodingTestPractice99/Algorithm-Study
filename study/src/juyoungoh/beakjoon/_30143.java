package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30143 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int n2 = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);
            int d = Integer.parseInt(s[2]);

            int answer = n2 * (a * 2 + (n2 - 1) * d) / 2;
            System.out.println(answer);
        }
    }
}
