package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _20977 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("");

        String answer = "";

        int jCount = 0;
        int iCount = 0;
        int oCount = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("J")) {
                jCount++;
            } else if (s[i].equals("O")) {
                oCount++;
            } else if (s[i].equals("I")) {
                iCount++;
            }
        }

        for (int i = 0; i < jCount; i++) {
            answer += "J";
        }

        for (int i = 0; i < oCount; i++) {
            answer += "O";
        }

        for (int i = 0; i < iCount; i++) {
            answer += "I";
        }
        System.out.println(answer);
    }
}
