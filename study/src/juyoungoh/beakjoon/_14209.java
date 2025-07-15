package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14209 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int a = 0;
        int k = 0;
        int q = 0;
        int j2 = 0;

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");
            for (int j = 0; j < s.length; j++) {
                if (s[j].equals("A")) {
                    a++;
                } else if (s[j].equals("K")) {
                    k++;
                } else if (s[j].equals("Q")) {
                    q++;
                } else if (s[j].equals("J")) {
                    j2++;
                }
            }
        }

        int answer = (a * 4) + (k * 3) + (q * 2) + (j2 * 1);
        System.out.println(answer);
    }
}
