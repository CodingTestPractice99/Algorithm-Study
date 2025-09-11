package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _34217 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int sum1 = Integer.parseInt(s1[0]) + Integer.parseInt(s2[0]);
        int sum2 = Integer.parseInt(s1[1]) + Integer.parseInt(s2[1]);

        if (sum1 < sum2) {
            System.out.println("Hanyang Univ.");
        } else if (sum1 > sum2) {
            System.out.println("Yongdap");
        } else {
            System.out.println("Either");
        }
    }
}
