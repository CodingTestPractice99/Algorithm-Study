package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6889 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String s1[] = new String[n];
        String s2[] = new String[m];

        for (int i = 0; i < n; i++) {
            s1[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            s2[i] = br.readLine();
        }

        for (String s : s1) {
            for (String s3 : s2) {
                System.out.println(s + " as " + s3);
            }
        }
    }
}
