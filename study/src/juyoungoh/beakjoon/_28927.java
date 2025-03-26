package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int s11 = (Integer.parseInt(s1[0]) * 3) + (Integer.parseInt(s1[1]) * 20) + Integer.parseInt(s1[2]) * 120;
        int s22 = (Integer.parseInt(s2[0]) * 3) + (Integer.parseInt(s2[1]) * 20) + Integer.parseInt(s2[2]) * 120;

        if (s11 > s22) {
            System.out.println("Max");
        } else if (s11 < s22) {
            System.out.println("Mel");
        } else {
            System.out.println("Draw");
        }
    }
}
