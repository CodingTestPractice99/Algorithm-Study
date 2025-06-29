package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _32723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");

        Set<Integer> wanted = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(s[i]);
            wanted.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (!wanted.contains(i)) {
                result.add(i);
            }
        }

        System.out.println(result.size());
        if (!result.isEmpty()) {
            Collections.sort(result);
            for (int x : result) {
                System.out.print(x + " ");
            }
        }
    }
}
