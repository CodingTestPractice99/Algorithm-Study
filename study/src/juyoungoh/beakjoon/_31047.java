package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _31047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int n2 = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n2; j++) {
                String str[] = br.readLine().split(" ");
                String s = str[0];
                int sNum = Integer.parseInt(str[1]);
                map.put(s, map.getOrDefault(s, 0) + sNum);
            }

            List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            Collections.sort(list, (o1, o2) -> {
                int compare = Integer.compare(o2.getValue(), o1.getValue());
                if (compare == 0) {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return compare;
            });
            System.out.println(list.size());
            for (Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
