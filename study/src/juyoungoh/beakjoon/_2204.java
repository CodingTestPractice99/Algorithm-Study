package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _2204 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) {
                break;
            } else {
                int n = Integer.parseInt(s);
                String[] words = new String[n];
                for (int i = 0; i < n; i++) {
                   words[i] = br.readLine();
                }
                Arrays.sort(words, Comparator.comparing(String::toLowerCase));
                System.out.println(words[0]);
            }
        }
    }
}
