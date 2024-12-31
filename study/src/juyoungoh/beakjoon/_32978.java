package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _32978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        String str[] = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            set.add(str[i]);
        }

        String str2[] = br.readLine().split(" ");
        for (int i = 0; i < n - 1; i++) {
            set.remove(str2[i]);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
