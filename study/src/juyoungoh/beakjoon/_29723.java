package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _29723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);
        int z = m - k;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            String s1 = str[0];
            int n1 = Integer.parseInt(str[1]);
            map.put(s1, n1);
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(br.readLine());
        }

        int answer1 = 0;
        int answer2 = 0;

        for (int i = 0; i < k; i++) {
            answer1 += map.get(list.get(i));
            answer2 += map.get(list.get(i));
        }

        for (int i = 0; i < k; i++) {
            map.remove(list.get(i));
        }

        List<Map.Entry<String, Integer>> list2 = new ArrayList<>(map.entrySet());
        list2.sort(Map.Entry.comparingByValue()); // 값 기준 오름차순 정렬

        for (int i = 0; i < z; i++) {
            answer1 += list2.get(i).getValue();
        }

        list2.sort(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed());

        for (int i = 0; i < z; i++) {
            answer2 += list2.get(i).getValue();
        }

        System.out.println(answer1 + " " + answer2);
    }
}
