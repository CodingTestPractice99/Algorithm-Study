package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String reverseStr = "";

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reverseStr += String.valueOf(inputStr.charAt(i));
        }

        if (inputStr.equals(reverseStr)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
