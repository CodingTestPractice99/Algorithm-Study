package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _18301 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]) + 1;
        int b = Integer.parseInt(str[1]) + 1;
        int c = Integer.parseInt(str[2]) + 1;

        int sum = a * b;

        int c2 = sum / c;
        int answer = c2 - 1;

        System.out.println(answer);
    }
}
