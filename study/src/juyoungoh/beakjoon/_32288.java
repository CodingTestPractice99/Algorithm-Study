package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _32288 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split("");

        String str = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("I")) {
                str += "i";
            } else {
                str += "L";
            }
        }
        System.out.println(str);
    }
}
