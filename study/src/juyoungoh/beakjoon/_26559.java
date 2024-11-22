package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class _26559 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new TreeMap<>();

            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < num; j++) {
                String str[] = br.readLine().split(" ");
                map.put(str[0], Integer.parseInt(str[1]));
            }
            List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, (o1, o2) -> {
                int compare = Integer.compare(o2.getValue(), o1.getValue());
                return compare;
            });

            List<String> sortedNames = new ArrayList<>();
            for (Entry<String, Integer> entry : list) {
                sortedNames.add(entry.getKey());
            }

            // 쉼표로 구분하여 출력
            System.out.println(String.join(", ", sortedNames));
        }
    }
}

