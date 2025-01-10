package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _32953 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String n2 = br.readLine();
            String str[] = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                map.put(str[j], map.getOrDefault(str[j], 0) + 1);
            }
        }

        int answer = 0;
        for (Integer value : map.values()) {
            if (value >= m) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
