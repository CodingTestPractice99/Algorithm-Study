package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2523 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) { // 0, 1, 2
            for (int j = 0; j < i + 1; j++) { // 0, 0, 1, 0, 1, 2
                sb.append('*');
            }
            sb.append('\n');
        }

        for (int i = 0; i < n - 1; i++) { // 0, 1
            for (int j = n - 1; j > i; j--) { // 2, 1 // 1
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
