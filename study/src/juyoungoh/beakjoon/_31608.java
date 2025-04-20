package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31608 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str1[] = br.readLine().split("");
        String str2[] = br.readLine().split("");

        int answer = 0;
        for (int i = 0; i < str1.length; i++) {
            if (!(str1[i].equals(str2[i]))) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
