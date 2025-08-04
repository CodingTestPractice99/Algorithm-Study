package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30999 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            String str[] = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("O")) {
                    count++;
                }
            }
            if (count >= (m / 2) + 1) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
