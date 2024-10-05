package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 0;

        if (n == 1) {
            System.out.println(num);
            return;
        }

        while (true) {
            if (String.valueOf(num).contains("666")) {
                count++;
                if (count == n) {
                    System.out.println(num);
                    return;
                }
            }
            num++;
        }
    }
}
