package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10820 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lowerCase = 0;
        int upperCase = 0;
        int num = 0;
        int blank = 0;

        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            char[] c = str.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (Character.isDigit(c[i])) {
                    num++;
                } else if (Character.isLowerCase(c[i])) {
                    lowerCase++;
                } else if (Character.isUpperCase(c[i])) {
                    upperCase++;
                } else {
                    blank++;
                }
            }
            System.out.println(lowerCase + " " + upperCase + " " + num + " " + blank);
            lowerCase = 0;
            upperCase = 0;
            num = 0;
            blank = 0;
        }
    }
}
