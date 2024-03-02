package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String star = "*";
        String blank = " ";

        int n = Integer.parseInt(br.readLine()); // 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                sb.append(blank);
            }
            for (int k = 1; k <= i; k++) {
                sb.append(star);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
