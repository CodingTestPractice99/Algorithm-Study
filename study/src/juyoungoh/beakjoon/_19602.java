package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _19602 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        int sum = (1 * n) + (2 * m) + (3 * z);

        if (sum >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
