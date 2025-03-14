package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5341 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            if (n == 0) {
                return;
            } else {
                for (int i = n; i > 0; i--) {
                    sum += i;
                }
                System.out.println(sum);
            }
        }
    }
}
