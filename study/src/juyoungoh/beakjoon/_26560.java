package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26560 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] split = s.split("");
            String s1 = split[split.length - 1];
            if (s1.equals(".")) {
                System.out.println(s);
            } else {
                System.out.println(s + ".");
            }
        }
    }
}
