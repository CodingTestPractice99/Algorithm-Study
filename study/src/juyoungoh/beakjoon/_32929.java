package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _32929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        int mod = (int) (n % 3);

        if (mod == 1) {
            System.out.println("U");
        } else if (mod == 2) {
            System.out.println("O");
        } else {
            System.out.println("S");
        }
    }
}
