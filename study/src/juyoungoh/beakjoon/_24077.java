package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24077 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (Integer.parseInt(s1[i]) <= Integer.parseInt(s2[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
