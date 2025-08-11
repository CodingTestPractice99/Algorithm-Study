package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31636 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine().trim();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'o') {
                count++;
                if (count >= 3) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("No");
    }
}
