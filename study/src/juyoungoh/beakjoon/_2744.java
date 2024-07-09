package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2744 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97) {
                answer += String.valueOf(str.charAt(i)).toUpperCase();
            } else  {
                answer += String.valueOf(str.charAt(i)).toLowerCase();
            }
        }
        System.out.println(answer);
    }
}
