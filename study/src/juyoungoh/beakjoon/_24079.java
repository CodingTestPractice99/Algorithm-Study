package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24079 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        int sum = n + m;
        double z2 = z + 0.5;

        if (sum > z2) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
