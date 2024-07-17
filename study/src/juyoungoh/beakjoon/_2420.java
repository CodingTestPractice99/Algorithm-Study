package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2420 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String strArray[] = str.split(" ");

        long a = Long.parseLong(strArray[0]);
        long b = Long.parseLong(strArray[1]);

        long c = Math.abs(a - b);

        System.out.println(c);
    }
}
