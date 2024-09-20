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

public class _20920 {

    static class WordFactory {

        String str;
        int size;

        public WordFactory(String str, int size) {
            this.str = str;
            this.size = size;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        List<WordFactory> list = new ArrayList<>();

        String str = br.readLine();
        String arr[] = str.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() >= m) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        for (Entry<String, Integer> entry : map.entrySet()) {
            list.add(new WordFactory(entry.getKey(), entry.getValue()));
        }

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o2.size, o1.size);
            int compare2 = Integer.compare(o2.str.length(), o1.str.length());
            int compare3 = o1.str.compareTo(o2.str);

            if (compare != 0) {
                return compare;
            }
            if (compare2 != 0) {
                return compare2;
            }
            if (compare3 != 0) {
                return compare3;
            }
            return compare;
        });

        StringBuilder sb = new StringBuilder();
        for (WordFactory wordFactory : list) {
            sb.append(wordFactory.str).append("\n");
        }
        System.out.print(sb);
    }
}
