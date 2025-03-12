package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33170 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        int sum = n + m + z;

        if (sum <= 21) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
