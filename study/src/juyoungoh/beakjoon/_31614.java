package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31614 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int m2 = h * 60;
        System.out.println(m + m2);
    }
}
