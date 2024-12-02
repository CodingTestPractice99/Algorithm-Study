package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31090 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int sNum = Integer.parseInt(s);
            String str[] = s.split("");
            String s2 = str[2] + str[3];
            int n2 = Integer.parseInt(s2);
            int m = (sNum + 1) % n2;
            if (m == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Bye");
            }
        }
    }
}