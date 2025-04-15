package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25600 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);
            int g = Integer.parseInt(s[2]);

            if (d + g == a) {
                int a2 = a * (d + g) * 2;
                if (max < a2) {
                    max = a2;
                }
            } else {
                int a2 = a * (d + g);
                if (max < a2) {
                    max = a2;
                }
            }
        }
        System.out.println(max);
    }
}
