package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                sb.append(' ');
            }
            for (int j = 0; j < i + 1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append(' ');
            }
            for (int j = n - 1; j > i; j--) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
