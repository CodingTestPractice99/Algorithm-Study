package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _11645 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int n2 = Integer.parseInt(br.readLine());
            Set<String> set = new HashSet<>();

            for (int j = 0; j < n2; j++) {
                set.add(br.readLine());
            }
            System.out.println(set.size());
        }
    }
}
