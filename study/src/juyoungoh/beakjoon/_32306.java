package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _32306 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int a = (Integer.parseInt(s1[0]) * 1) + (Integer.parseInt(s1[1]) * 2) + (Integer.parseInt(s1[2]) * 3);
        int b = (Integer.parseInt(s2[0]) * 1) + (Integer.parseInt(s2[1]) * 2) + (Integer.parseInt(s2[2]) * 3);

        if (a > b) {
            System.out.println(1);
        } else if (a < b) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
