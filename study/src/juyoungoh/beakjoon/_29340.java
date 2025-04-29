package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _29340 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split("");
        String s2[] = br.readLine().split("");

        String answer = "";
        for (int i = 0; i < s1.length; i++) {
            if (Integer.parseInt(s1[i]) > Integer.parseInt(s2[i])) {
                answer += s1[i];
            } else if (Integer.parseInt(s2[i]) > Integer.parseInt(s1[i])) {
                answer += s2[i];
            } else {
                answer += s1[i];
            }
        }
        System.out.println(answer);
    }
}
