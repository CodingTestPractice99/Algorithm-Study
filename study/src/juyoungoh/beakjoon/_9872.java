package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _9872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            Arrays.sort(s);
            list.add(Arrays.toString(s));
        }

        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<Entry<String ,Integer>> list2 = new ArrayList<>(map.entrySet());

        Collections.sort(list2, (o1, o2) -> {
            int compare = Integer.compare(o2.getValue(), o1.getValue());
            return compare;
        });

        for (Entry<String, Integer> entry : list2) {
            System.out.println(entry.getValue());
            return;
        }
    }
}
