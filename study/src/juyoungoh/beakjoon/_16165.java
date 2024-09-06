package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _16165 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String arr[] = str.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        Map<String, List<String>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String group = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());
            for (int j = 0; j < memberCount; j++) {
                String member = br.readLine();
                map.computeIfAbsent(group, k -> new ArrayList<>()).add(member);
            }
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            int num = Integer.parseInt(br.readLine());
            if (num == 1) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if (entry.getValue().contains(name)) {
                        System.out.println(entry.getKey());
                        break;
                    }
                }
            } else if (num == 0) {
                List<String> members = map.get(name);
                if (members != null) {
                    Collections.sort(members);
                    for (String member : members) {
                        System.out.println(member);
                    }
                }
            }
        }
    }
}
