package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int totalRounds = n + 1;
        int min = 2 * totalRounds;
        int max = 3 * totalRounds;

        System.out.println(min + " " + max);
    }
}
