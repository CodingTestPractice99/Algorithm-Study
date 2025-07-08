package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8371 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s1[] = br.readLine().split("");
        String s2[] = br.readLine().split("");

        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!(s1[i].equals(s2[i]))) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
