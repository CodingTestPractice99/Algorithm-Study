package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7130 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int a1 = Integer.parseInt(s[0]);
        int b1 = Integer.parseInt(s[1]);

        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            int a2 = a * a1;
            int b2 = b * b1;

            if (a2 > b2) {
                sum += a2;
            } else if (b2 > a2) {
                sum += b2;
            }
        }
        System.out.println(sum);
    }
}
