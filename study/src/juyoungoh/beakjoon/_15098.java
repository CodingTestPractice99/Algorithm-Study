package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _15098 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet<>();
        String s[] = br.readLine().split(" ");

        int n = 0;
        for (int i = 0; i < s.length; i++) {
            if (!(set.contains(s[i]))) {
                set.add(s[i]);
            } else {
                n = 1;
                System.out.println("no");
                break;
            }
        }

        if (n == 0) {
            System.out.println("yes");
        }
    }
}
