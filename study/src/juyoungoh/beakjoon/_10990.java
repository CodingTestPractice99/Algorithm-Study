package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10990 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) { // 공백
                sb.append(' ');
            }
            for (int k = 0; k < 1; k++) {
                sb.append('*');
            }
            for (int j = 1; j < i * 2 - 2; j++) { // 1, 3, 5
                sb.append(' ');
            }
            if (i != 1) {
                for (int j = 0; j < 1; j++) {
                    sb.append('*');
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
