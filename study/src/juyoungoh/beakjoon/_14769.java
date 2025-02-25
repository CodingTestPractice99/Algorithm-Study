package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _14769 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            String str = s[0];
            if (Character.isDigit(str.charAt(0))) {
                int i1 = Integer.parseInt(str) / 2;
                map.put(s[1], i1);
            } else {
                map.put(s[0], Integer.parseInt(s[1]));
            }
        }

        List<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        for (Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey());
        }
    }
}
