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

public class _11292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            int n = Integer.parseInt(str);
            Map<Double, List<String>> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                String arr[] = br.readLine().split(" ");
                double d = Double.parseDouble(arr[1]);
                if (!map.containsKey(d)) {
                    map.put(d, new ArrayList<>());
                    map.get(d).add(arr[0]);
                } else {
                    map.get(d).add(arr[0]);
                }
            }
            List<Entry<Double, List<String>>> list = new ArrayList<>(map.entrySet());

            Collections.sort(list, (o1, o2) -> {
                int compare = Double.compare(o2.getKey(), o1.getKey());
                return compare;
            });

            for (Entry<Double, List<String>> entry : list) {
                int m = entry.getValue().size();
                for (int i = 0; i < m; i++) {
                    System.out.print(entry.getValue().get(i) + " ");
                }
                System.out.println();
                break;
            }
        }
    }
}