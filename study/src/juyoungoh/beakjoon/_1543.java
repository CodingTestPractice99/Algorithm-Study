package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = br.readLine();

        int count = 0;

        for (int i = 0; i < str.length() / answer.length(); i++) {
            if (str.substring(i, answer.length()).equals(answer)) {
                count++;
            }
        }
    }
}
