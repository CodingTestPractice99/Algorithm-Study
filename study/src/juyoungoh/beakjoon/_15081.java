package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class _15081 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            for (int j = 1; j < s.length ; j++) {
                if (!set.contains(s[j])) {
                    set.add(s[j]);
                    break;
                }
            }
        }
        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
