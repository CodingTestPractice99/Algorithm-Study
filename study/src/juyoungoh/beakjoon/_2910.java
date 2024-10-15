package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _2910 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int c = Integer.parseInt(arr[1]);

        String arr2[] = br.readLine().split(" ");

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr2[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, ((o1, o2) -> {
            int compare = Integer.compare(o2.getValue(), o1.getValue());

            return compare;
        }));

        StringBuilder sb = new StringBuilder();
        for (Entry<Integer, Integer> entry : list) {
            int number = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sb.append(number).append(" ");
            }
        }
        System.out.print(sb.toString().trim());
    }
}
