package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15295 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[1]);

            int answer = a * (a + 3) / 2;
            System.out.println((i + 1) + " " + answer);
        }
    }
}
