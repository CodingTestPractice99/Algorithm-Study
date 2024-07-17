package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2420 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String strArray[] = str.split(" ");

        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);

        int a2 = Math.abs(a);
        int b2 = Math.abs(b);

        System.out.println(a2 + b2);
    }
}
