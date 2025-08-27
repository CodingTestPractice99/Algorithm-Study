package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33571 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");

        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("@") || s[i].equals("b") || s[i].equals("A") || s[i].equals("a") || s[i].equals("D")
                || s[i].equals("d") || s[i].equals("e") || s[i].equals("g") || s[i].equals("O") || s[i].equals("o") ||
                s[i].equals("P") || s[i].equals("p") || s[i].equals("Q") || s[i].equals("q") || s[i].equals("R")) {
                count++;
            } else if (s[i].equals("B")) {
                count += 2;
            }
        }
        System.out.println(count);
    }
}
