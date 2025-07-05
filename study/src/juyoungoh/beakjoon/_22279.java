package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _22279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double answer = 0;

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);

            answer += a * b;
        }
        System.out.println(answer);
    }
}
