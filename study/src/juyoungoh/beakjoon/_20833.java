package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _20833 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        double answer = 0;
        for (int i = n; i >= 1; i--) {
            answer += Math.pow(i, 3);
        }
        System.out.println((int) answer);
    }
}
