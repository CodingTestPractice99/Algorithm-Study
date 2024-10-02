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
import java.util.Set;
import java.util.StringTokenizer;

public class _1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap();

        for (int i = 0; i < n + m; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        Set<Entry<String, Integer>> entries = map.entrySet();

        int count = 0;
        List<String> list = new ArrayList<>();
        for (Entry<String, Integer> entry : entries) {
            if (entry.getValue() == 2) {
                list.add(entry.getKey());
                count++;
            }
        }

        Collections.sort(list);
        System.out.println(count);

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
