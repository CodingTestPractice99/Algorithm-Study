package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17388 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int sum = 0;

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }

        if (sum >= 100) {
            System.out.println("OK");
        } else {
            if (a < b && a < c) {
                System.out.println("Soongsil");
            } else if (b < a && b < c) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}
