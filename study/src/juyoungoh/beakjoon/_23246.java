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

public class _23246 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            int number = Integer.parseInt(str[0]);
            int count = Integer.parseInt(str[1]) * Integer.parseInt(str[2]) * Integer.parseInt(str[3]);
            int plus = Integer.parseInt(str[1]) + Integer.parseInt(str[2]) + Integer.parseInt(str[3]);
            List<Integer> integerList = new ArrayList<>();
            integerList.add(count);
            integerList.add(plus);
            map.put(number, integerList);
        }

        List<Entry<Integer, List<Integer>>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o1.getValue().get(0), o2.getValue().get(0));
            int compare2 = Integer.compare(o1.getValue().get(1), o2.getValue().get(1));
            if (compare == 0 && compare2 == 0) {
                return Integer.compare(o1.getKey(), o2.getKey());
            } else if (compare == 0 && compare2 != 0) {
                return compare2;
            }
            return compare;
        });

        int index = 0;
        for (Entry<Integer, List<Integer>> entry : list) {
            if (index > 2) {
                break;
            }
            System.out.print(entry.getKey() + " ");
            index++;
        }
    }
}
