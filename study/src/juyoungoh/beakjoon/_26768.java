package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26768 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringBuilder sb = new StringBuilder(line.length());

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            switch (c) {
                case 'a': sb.append('4'); break;
                case 'e': sb.append('3'); break;
                case 'i': sb.append('1'); break;
                case 'o': sb.append('0'); break;
                case 's': sb.append('5'); break;
                default: sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
