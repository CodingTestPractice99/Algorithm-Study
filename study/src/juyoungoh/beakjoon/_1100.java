package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1100 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        for (int i = 1; i <= 8; i++) {
            String str[] = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("F") && i % 2 == 1 && j % 2 == 0) {
                    answer++;
                } else if (str[j].equals("F") && i % 2 == 0 && j % 2 == 1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
