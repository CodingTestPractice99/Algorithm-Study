package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4458 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String answer = "";
            String str[] = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                if (j == 0) {
                    answer += str[j].toUpperCase();
                } else {
                    answer += str[j];
                }
            }
            System.out.println(answer);
        }
    }
}
