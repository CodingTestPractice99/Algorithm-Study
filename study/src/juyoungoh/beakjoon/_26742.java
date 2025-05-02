package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26742 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        int b = 0;
        int c = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("B")) {
                b++;
            } else if (s[i].equals("C")) {
                c++;
            }
        }

        int b2 = b / 2;
        int c2 = c / 2;

        System.out.println(b2 + c2);
    }
}
