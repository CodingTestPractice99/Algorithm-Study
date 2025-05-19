package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _18408 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int one = 0;
        int two = 0;

        for (int i = 0; i < s.length; i++) {
            if (Integer.parseInt(s[i]) == 1) {
                one++;
            } else {
                two++;
            }
        }

        if (one > two) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
