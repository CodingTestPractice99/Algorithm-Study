package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8545 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        String answer = "";

        for (int i = s.length - 1; i >= 0; i--) {
            answer += s[i];
        }

        System.out.println(answer);
    }
}
