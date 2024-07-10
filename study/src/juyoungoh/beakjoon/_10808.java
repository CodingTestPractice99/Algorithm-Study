package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int num[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int number = str.charAt(i) - 97;
            num[number] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            sb.append(num[i]).append(" ");
        }
        System.out.println(sb);
    }
}
