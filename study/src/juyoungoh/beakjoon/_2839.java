package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n >= 3) {
            if (n % 5 == 0) {
                n /= 5;
                count++;
            } else if (n % 3 == 0) {
                n /= 3;
                count++;
            }
        }

        if (n == 0) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
