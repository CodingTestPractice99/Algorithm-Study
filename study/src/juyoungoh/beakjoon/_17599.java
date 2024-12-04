package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _17599 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            int m = Integer.parseInt(s[i]);
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        System.out.println(map.size());
    }

}
