package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21354 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]) * 7;
        int b = Integer.parseInt(s[1]) * 13;

        if (a < b) {
            System.out.println("Petra");
        } else if (a > b) {
            System.out.println("Axel");
        } else {
            System.out.println("lika");
        }
    }
}
