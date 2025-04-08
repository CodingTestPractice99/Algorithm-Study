package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = 100 - n;

        double a = 100.0 / n;
        double b = 100.0 / m;

        System.out.printf("%.10f\n", a);
        System.out.printf("%.10f\n", b);
    }
}
