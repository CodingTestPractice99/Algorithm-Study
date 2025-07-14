package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30794 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        String str = s[1];

        int score = 0;

        switch (str) {
            case "miss":
                score = 0;
                break;
            case "bad":
                score = 200 * n;
                break;
            case "cool":
                score = 400 * n;
                break;
            case "great":
                score = 600 * n;
                break;
            case "perfect":
                score = 1000 * n * 1;
                break;
        }

        System.out.println(score);
    }
}
