package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _29986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        String str[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            if (m >= Integer.parseInt(str[i])) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
