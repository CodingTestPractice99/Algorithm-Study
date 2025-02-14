package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33162 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer += 3;
            } else {
                answer -= 2;
            }
        }
        System.out.println(answer);
    }
}
