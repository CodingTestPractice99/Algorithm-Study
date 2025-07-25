package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _29308 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        String person = "";

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            String s2 = s[1];
            String s3 = s[2];

            if (s3.equals("Russia")) {
                if (max < s1) {
                    max = s1;
                    person = s2;
                }
            }
        }
        System.out.println(person);
    }
}
