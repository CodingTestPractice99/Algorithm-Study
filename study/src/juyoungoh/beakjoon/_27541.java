package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split("");

        String answer = "";
        if (s[n - 1].equals("G")) {
            for (int i = 0; i < s.length - 1; i++) {
                answer += s[i];
            }
        } else {
            for (int i = 0; i < s.length; i++) {
                answer += s[i];
            }
            answer += "G";
        }
        System.out.println(answer);
    }
}
