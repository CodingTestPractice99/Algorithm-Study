package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16719 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split("");

        for (int i = 0; i < str.length; i++) { // 0
            for (int j = 0; j < str.length; j++) {
                if (str[i].charAt(i) < str[j].charAt(j)) {

                }
            }
        }

    }

}
