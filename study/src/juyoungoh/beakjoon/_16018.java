package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String yesterday = br.readLine().trim();
        String today = br.readLine().trim();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (yesterday.charAt(i) == 'C' && today.charAt(i) == 'C') {
                count++;
            }
        }

        System.out.println(count);
    }
}
