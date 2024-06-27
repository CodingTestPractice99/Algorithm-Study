package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2444_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) { // 1, 2, 3, 4, 5
            for (int j = 1; j <= n - i; j++) { // 4, 3, 2, 1
                sb.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // 1, 3, 5, 7, 9
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = n - 1; i >= 1; i--) { // 4, 3, 2, 1
            for (int j = 1; j <= n - i; j++) { // 1, 2, 3, 4
                sb.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // 7, 5, 3, 1
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
