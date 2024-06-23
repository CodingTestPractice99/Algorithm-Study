package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        String str1 = input[0];
        String str2 = input[1];

        String num1 = "";
        String num2 = "";
        int index1 = 0;
        int index2 = 0;

        for (int i = 3 - 1; i >= 0; i--) {
            num1 += String.valueOf(str1.charAt(i));
        }

        for (int i = 3 - 1; i >= 0; i--) {
            num2 += String.valueOf(str2.charAt(i));
        }

        index1 = Integer.parseInt(num1);
        index2 = Integer.parseInt(num2);

        if (index1 > index2) {
            System.out.println(index1);
        } else {
            System.out.println(index2);
        }
    }
}
