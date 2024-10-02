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

public class _7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String arr[] = str.split(" ");
            map.put(arr[0], arr[1]);
        }

        List<String> list = new ArrayList<>();

        Set<Entry<String, String>> entries = map.entrySet();
        for (Entry<String, String> entry : entries) {
            if (entry.getValue().equals("enter")) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
