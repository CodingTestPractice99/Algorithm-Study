package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _11346 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Set<String> set = new HashSet<>();
            String s = br.readLine();
            String str[] = br.readLine().split(" ");
            String s2[] = br.readLine().split(" ");
            for (int j = 0; j < s2.length; j++) {
                set.add(s2[j]);
            }
            String s3[] = br.readLine().split(" ");
            for (int j = 0; j < s3.length; j++) {
                set.add(s3[j]);
            }
            System.out.println(set.size());
        }
    }
}
