package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27890 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        for (int i = 0; i < b; i++) {
            if (a % 2 == 0) {
                a = (a / 2) ^ 6;
            } else {
                a = (2 * a) ^ 6;
            }
        }
        System.out.println(a);
    }
}
