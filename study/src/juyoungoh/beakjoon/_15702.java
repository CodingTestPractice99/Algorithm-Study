package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _15702 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        String arr2[] = br.readLine().split(" ");
        int score[] = new int[n + 1];

        for (int i = 0; i < arr2.length; i++) {
            score[i] = Integer.parseInt(arr2[i]);
        }

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < m; i++) {
            String arr3[] = br.readLine().split(" ");

            int num = Integer.parseInt(arr3[0]);
            map.put(num, 0);

            for (int j = 0; j < score.length; j++) {
                if (arr3[j].equals("O")) {
                    map.put(num, map.getOrDefault(num, 0) + score[j - 1]);
                }
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o2.getValue(), o1.getValue());

            if (compare == 0) {
                return Integer.compare(o1.getKey(), o2.getKey());
            }
            return compare;
        });

        System.out.print(list.get(0).getKey() + " " + list.get(0).getValue());
    }
}
