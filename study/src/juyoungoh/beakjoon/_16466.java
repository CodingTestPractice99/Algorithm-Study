package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class _16466 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < s.length; i++) {
            set.add(Integer.parseInt(s[i]));
        }

        int n2 = 1;
        while (true) {
            if (!set.contains(n2)) {
                System.out.println(n2);
                break;
            } else {
                n2++;
            }
        }
    }
}
