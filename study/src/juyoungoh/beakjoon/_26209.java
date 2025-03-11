package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26209 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");


        for (int i = 0; i < s.length; i++) {
            if (Integer.parseInt(s[i]) == 0 || Integer.parseInt(s[i]) == 1) {
                continue;
            } else {
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
}
