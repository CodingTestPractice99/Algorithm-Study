package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _25277 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> forbidden = new HashSet<>(Arrays.asList("he", "him", "she", "her"));

        int answer = 0;

        String s[] = br.readLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            if (forbidden.contains(s[i])) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
