package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28074 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split("");

        int m = 0;
        int o = 0;
        int i = 0;
        int b = 0;
        int s = 0;

        for (int j = 0; j < str.length; j++) {
            if (str[j].equals("M")) {
                m++;
            } else if (str[j].equals("O")) {
                o++;
            } else if (str[j].equals("B")) {
                b++;
            } else if (str[j].equals("I")) {
                i++;
            } else if (str[j].equals("S")) {
                s++;
            }
        }

        if (m >= 1 && o >= 1 && i >= 1 && b >= 1 && s >= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
