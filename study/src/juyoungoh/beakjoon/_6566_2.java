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

public class _6566_2 {

    static class Group {

        List<String> words;
        int size;

        Group(List<String> words, int size) {
            this.words = words;
            this.size = size;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Map<String, Integer>> map = new HashMap<>();

        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            char c[] = str.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            map.putIfAbsent(key, new HashMap<>());
            Map<String, Integer> countWord = map.get(key);
            countWord.put(str, countWord.getOrDefault(str, 0) + 1);
        }

        List<Group> groups = new ArrayList<>();

        for (Map<String, Integer> countWord : map.values()) {
            List<String> groupList = new ArrayList<>(countWord.keySet());
            Collections.sort(groupList);

            int size = 0;
            for (int count : countWord.values()) {
                size += count;
            }
            groups.add(new Group(groupList, size));
        }

        Collections.sort(groups, (o1, o2) -> {
            if (o1.size != o2.size) {
                return Integer.compare(o2.size, o1.size);
            }
            return o1.words.get(0).compareTo(o2.words.get(0));
        });

        // Group of size 5: caret carte cater crate trace .
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Group group : groups) {
            if (count >= 5) {
                break;
            }
            sb.append("Group of size ").append(group.size).append(":");

            for (String word : group.words) {
                sb.append(" ").append(word);
            }
            sb.append(" .\n");
            count++;
        }
        System.out.print(sb);
    }
}
