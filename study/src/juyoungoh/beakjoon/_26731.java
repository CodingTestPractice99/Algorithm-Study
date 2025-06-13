package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _26731 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");

        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length; i++) {
            set.add(s[i]);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            if (!set.contains(String.valueOf(c))) {
                System.out.println(c);
                break;
            }
        }
    }
}