package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15059 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int a1 = Integer.parseInt(s1[0]);
        int a2 = Integer.parseInt(s1[1]);
        int a3 = Integer.parseInt(s1[2]);

        int b1 = Integer.parseInt(s2[0]);
        int b2 = Integer.parseInt(s2[1]);
        int b3 = Integer.parseInt(s2[2]);

        int answer = 0;

        if (a1 - b1 < 0) {
            answer += b1 - a1;
        }

        if (a2 - b2 < 0) {
            answer += b2 - a2;
        }

        if (a3 - b3 < 0) {
            answer += b3 - a3;
        }

        System.out.println(answer);
    }
}
