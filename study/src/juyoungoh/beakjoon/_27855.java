package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27855 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);

        int c = Integer.parseInt(s2[0]);
        int d = Integer.parseInt(s2[1]);

        int sum1 = (a * 3) + (b * 1);
        int sum2 = (c * 3) + (d * 1);

        if (sum1 == sum2) {
            System.out.println("NO SCORE");
        } else if (sum1 < sum2) {
            System.out.println(2 + " " + (sum2 - sum1));
        } else if (sum1 > sum2) {
            System.out.println(1 + " " + (sum1 - sum2));
        }
    }
}
