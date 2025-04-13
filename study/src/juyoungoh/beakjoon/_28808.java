package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.contains("+")) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
