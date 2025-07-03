package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class _15340 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("0 0")) {
                 break;
            }
            String[] s1 = s.split(" ");
            int a = Integer.parseInt(s1[0]);
            int b = Integer.parseInt(s1[1]);

            int sum1 = (a * 30) + (b * 40);
            int sum2 = (a * 35) + (b * 30);
            int sum3 = (a * 40) + (b * 20);

            int min = sum1;
            if (sum1 > sum2) {
                min = sum2;
            }
            if (sum2 > sum3) {
                min = sum3;
            }
            System.out.println(min);
        }
    }
}
