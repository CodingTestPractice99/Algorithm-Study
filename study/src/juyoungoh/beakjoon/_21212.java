package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int min = b / a;
        for (int i = 0; i < n - 1; i++) {
            String s2[] = br.readLine().split(" ");

            int a2 = Integer.parseInt(s2[0]);
            int b2 = Integer.parseInt(s2[1]);

            if (min > b2 / a2) {
                min = b2 / a2;
            }
        }
        System.out.println(min);
    }
}
