package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27219 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int five = n / 5;
        int one = n % 5;

        String answer = "";

        for (int i = 0; i < five; i++) {
          answer += "V";
        }

        for (int i = 0; i < one; i++) {
            answer += "I";
        }

        System.out.println(answer);
    }
}
