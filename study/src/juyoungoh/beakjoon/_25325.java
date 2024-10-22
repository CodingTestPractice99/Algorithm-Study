package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class _25325 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        String arr[] = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            map.put(str, map.getOrDefault(str, 0));
        }
        for (int i = 0; i < n; i++) {
            String str2[] = br.readLine().split(" ");
            if (str2.length == 1) {
                map.put(str2[0], map.getOrDefault(str2[0], 0) + 1);
            } else {
                for (int j = 0; j < str2.length; j++) {
                    map.put(str2[j], map.getOrDefault(str2[j], 0) + 1);
                }
            }
        }

        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o2.getValue(), o1.getValue());
            if (compare == 0) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return compare;
        });

        for (Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
