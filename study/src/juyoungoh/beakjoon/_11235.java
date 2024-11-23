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

public class _11235 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o2.getValue(), o1.getValue());
            if (compare == 0) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return compare;
        });

        List<String> list2 = new ArrayList<>();

        int count = list.get(0).getValue();
        for (Entry<String, Integer> entry : list) {
            if (count == entry.getValue()) {
                System.out.println(entry.getKey());
            } else {
                break;
            }
        }
    }
}
