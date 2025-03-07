package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _18409 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("");

        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("a") || s[i].equals("e") || s[i].equals("o")
                || s[i].equals("i") || s[i].equals("u")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
