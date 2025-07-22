package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _19774 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");

            int num1 = Integer.parseInt(s[0] + s[1]);
            int num2 = Integer.parseInt(s[2] + s[3]);

            int num11 = num1 * num1;
            int num22 = num2 * num2;

            int sum = num11 + num22;

            if (sum % 7 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
