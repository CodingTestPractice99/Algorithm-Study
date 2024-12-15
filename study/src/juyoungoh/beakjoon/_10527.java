package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _10527 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }

        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }

        int sum = 0;
        for (Entry<String, Integer> entry : map1.entrySet()) {
            int count1 = entry.getValue();
            int count2 = map2.getOrDefault(entry.getKey(), 0);
            sum += Math.min(count1, count2);
        }
        System.out.println(sum);
    }
}
