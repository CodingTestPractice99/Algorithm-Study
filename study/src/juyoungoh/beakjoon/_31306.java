package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31306 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("a")) {
                count1++;
                count2++;
            } else if (s[i].equals("e")) {
                count1++;
                count2++;
            } else if (s[i].equals("i")) {
                count1++;
                count2++;
            } else if (s[i].equals("o")) {
                count1++;
                count2++;
            } else if (s[i].equals("u")) {
                count1++;
                count2++;
            } else if (s[i].equals("y")) {
                count2++;
            }
        }
        System.out.println(count1 + " " + count2);
    }
}
