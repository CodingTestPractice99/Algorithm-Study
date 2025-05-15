package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30156 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String s = br.readLine();

            int a = 0;
            int b = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a') {
                    a++;
                } else {
                    b++;
                }
            }
            System.out.println(Math.min(a, b));
        }

    }
}
