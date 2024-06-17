package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10952_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';

            if (a == 0 && b == 0) {
                break;
            }
            sb.append((a + b)).append('\n');
        }
        System.out.println(sb);
    }
}
