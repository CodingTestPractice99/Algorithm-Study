package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _12595 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String str[] = br.readLine().split(" ");
            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < str.length; j++) {
                if (set.contains(Integer.parseInt(str[j]))) {
                    set.remove(Integer.parseInt(str[j]));
                } else {
                    set.add(Integer.parseInt(str[j]));
                }
            }
            for (Integer integer : set) {
                System.out.println("Case #" + (i + 1) + ": " + integer);
            }
        }
    }
}
