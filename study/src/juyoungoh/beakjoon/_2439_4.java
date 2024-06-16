package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2439_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                bw.write(' ');
            }
            for (int k = 1; k <= i; k++) {
                bw.write('*');
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
