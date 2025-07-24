package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28637 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");
            String answer = "";
            for (int j = 0; j < s.length; j++) {
                if (s[j].equals(s[j].toUpperCase()) && j != 0) {
                    answer += "_" + s[j].toLowerCase();
                } else if (j == 0) {
                    answer += s[j].toLowerCase();
                } else {
                    answer += s[j];
                }
            }
            System.out.println(answer);
        }
    }
}
