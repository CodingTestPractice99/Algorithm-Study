package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3046 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number[] = br.readLine().split(" ");
        int s = Integer.parseInt(number[1]) * 2;
        int r1 = Integer.parseInt(number[0]);

        System.out.println(s - r1);
    }
}
