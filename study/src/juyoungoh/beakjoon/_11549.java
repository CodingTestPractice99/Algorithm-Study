package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11549 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");

        int answer = 0;
        for (int i = 0; i < s.length; i++) {
            if (n == Integer.parseInt(s[i])) {
                answer++;
            }

        }
        System.out.println(answer);
    }
}
