package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28490 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int max = 0;

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int mul = a * b;

            if (max < mul) {
                max = mul;
            }
        }

        System.out.println(max);
    }
}
