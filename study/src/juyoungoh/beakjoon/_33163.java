package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33163 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("");

        String answer = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("J")) {
                answer += "O";
            } else if (s[i].equals("O")) {
                answer += "I";
            } else if (s[i].equals("I")) {
                answer += "J";
            }
        }
        System.out.println(answer);
    }
}
