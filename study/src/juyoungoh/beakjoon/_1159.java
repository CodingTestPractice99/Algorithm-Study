package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1159 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[26];
        int n = Integer.parseInt(br.readLine());

        String answer = "";

        for (int i = 0; i < n; i++) {
            char c[] = br.readLine().toCharArray();
            a[c[0] - 97] += 1;
        }

        char alphabet[] = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 5) {
                answer += alphabet[i];
            }
        }

        if (answer.isBlank()) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(answer);
        }
    }
}
