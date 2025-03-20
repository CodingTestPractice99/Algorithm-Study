package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _29163 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        int a = 0;
        int b = 0;

        for (int i = 0; i < s.length; i++) {
            if (Integer.parseInt(s[i]) % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }

        if (a > b) {
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }
    }
}