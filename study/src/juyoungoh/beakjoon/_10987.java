package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10987 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals("a") ||
                String.valueOf(str.charAt(i)).equals("e") ||
                String.valueOf(str.charAt(i)).equals("i") ||
                String.valueOf(str.charAt(i)).equals("o") ||
                String.valueOf(str.charAt(i)).equals("u"))
                count++;{
            }
        }
        System.out.println(count);
    }
}
