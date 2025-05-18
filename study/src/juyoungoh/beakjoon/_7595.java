package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7595 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String star = "*";

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) {
                break;
            }
            int n = Integer.parseInt(s);

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(star);
                }
                System.out.println();
            }
        }
    }
}
