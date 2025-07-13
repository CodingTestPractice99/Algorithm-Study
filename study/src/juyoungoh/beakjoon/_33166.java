package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33166 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int P = Integer.parseInt(s1[0]);
        int Q = Integer.parseInt(s1[1]);
        int A = Integer.parseInt(s2[0]);
        int B = Integer.parseInt(s2[1]);

        int answer = 0;
        if (Q <= P) {
            answer = Q * A;
        } else {
            answer = P * A + (Q - P) * B;
        }
        System.out.println(answer);
    }
}
