package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24736 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int t1 = Integer.parseInt(s[0]) * 6;
        int f1 = Integer.parseInt(s[1]) * 3;
        int s1 = Integer.parseInt(s[2]) * 2;
        int p1 = Integer.parseInt(s[3]) * 1;
        int c1 = Integer.parseInt(s[4]) * 2;

        int t2 = Integer.parseInt(s2[0]) * 6;
        int f2 = Integer.parseInt(s2[1]) * 3;
        int s22 = Integer.parseInt(s2[2]) * 2;
        int p2 = Integer.parseInt(s2[3]) * 1;
        int c2 = Integer.parseInt(s2[4]) * 2;

        int sum1 = t1 + f1 + s1 + p1 + c1;
        int sum2 = t2 + f2 + s22 + p2 + c2;

        System.out.println(sum1 + " " + sum2);
    }
}
