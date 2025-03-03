package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28444 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int h = Integer.parseInt(str[0]);
        int i = Integer.parseInt(str[1]);
        int a = Integer.parseInt(str[2]);
        int r = Integer.parseInt(str[3]);
        int c = Integer.parseInt(str[4]);

        int num1 = h * i;
        int num2 = a * r * c;

        System.out.println(num1 - num2);
    }
}
