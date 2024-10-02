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

public class _6566 {

    // 입력으로 들어온 문자열들에 대해 '같은 단어는 한 번만 출력'해야 한다.
    // 반면에 그룹의 크기를 구할 때는 동일한 문자라도 세줘야 한다.
    // 즉, 입력으로 "aaaa"가 5번 들어왔다면
    // 출력은 "Group of size 5: aaaa ."와 같이 이루어져야 한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Map<String, Integer>> map = new HashMap<>();

        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            if (!map.containsKey(key)) {
                map.put(key, new HashMap<>());
            }
            Map<String, Integer> countWord = map.get(key);
            countWord.put(str, countWord.getOrDefault(str, 0) + 1);
        }

        List<List<String>> list = new ArrayList<>();

        /* for (Set<String> value : map.values()) {
            list.add(new ArrayList<>(value));
        }

         */

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o2.size(), o1.size());
            if (compare == 0) {
                Collections.sort(o1);
                Collections.sort(o2);
                return o1.get(0).compareTo(o2.get(0));
            }
            return compare;
        });

        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (count > 4) {
                break;
            }
            if (count <= 4) {
                Collections.sort(list.get(i));
                sb.append("Group of size " + list.get(i).size() + ":");
                for (int j = 0; j < list.get(i).size(); j++) {
                    sb.append(" " + list.get(i).get(j));
                }
                sb.append(" .").append("\n");
                count++;
            }
        }
        System.out.println(sb);
    }
}
