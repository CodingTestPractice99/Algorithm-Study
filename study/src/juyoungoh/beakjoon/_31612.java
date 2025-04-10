package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31612 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("");

        int answer = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("j") || s[i].equals("i")){
                answer += 2;
            } else if (s[i].equals("o")) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}
