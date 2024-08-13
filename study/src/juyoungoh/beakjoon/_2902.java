package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2902 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String strArr[] = str.split("-");

        for (int i = 0; i < strArr.length; i++) {
            char c[] = strArr[i].toCharArray();
            System.out.print(c[0]);
        }
    }
}
