package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char charStr = str.charAt(i);
            if (charStr == 'c' && i < str.length() - 1 && str.charAt(i + 1) == '=') {
                i++;
            } else if (charStr == 'c' && i < str.length() - 1 && str.charAt(i + 1) == '-') {
                i++;
            } else if (charStr == 'd' && i < str.length() - 2 && str.charAt(i + 1) == 'z'
                && str.charAt(i + 2) == '=') {
                i += 2;
            } else if (charStr == 'd' && i < str.length() - 1 && str.charAt(i + 1) == '-') {
                i++;
            } else if (charStr == 'l' && i < str.length() - 1 && str.charAt(i + 1) == 'j') {
                i++;
            } else if (charStr == 'n' && i < str.length() - 1 && str.charAt(i + 1) == 'j') {
                i++;
            } else if (charStr == 's' && i < str.length() - 1 && str.charAt(i + 1) == '=') {
                i++;
            } else if (charStr == 'z' && i < str.length() - 1 && str.charAt(i + 1) == '=') {
                i++;
            }
            count++;
        }
        System.out.println(count);
    }
}