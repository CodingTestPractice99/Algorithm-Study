package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8638 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");

        int n1[] = new int[n];
        for (int i = 0; i < s.length; i++) {
            n1[i] = Integer.parseInt(s[i]);
        }

        int max = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            if (max < n1[i]) {
                max = n1[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (n1[i] == max) {
                sb.append((char) ('A' + i));
            }
        }
        System.out.println(sb.toString());
    }
}
