package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int sum1 = a * b;
        int sum2 = b * c;
        int sum3 = a + sum2;

        if (sum1 < sum3) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
