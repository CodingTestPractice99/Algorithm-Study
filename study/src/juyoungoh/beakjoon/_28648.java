package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28648 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str[] = br.readLine().split(" ");
        int answer = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);

        for (int i = 0; i < n - 1; i++) {
            String s[] = br.readLine().split(" ");
            int sum = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
            if (answer > sum) {
                answer = sum;
            }
        }
        System.out.println(answer);
    }
}
