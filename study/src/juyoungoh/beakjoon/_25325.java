package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _25325 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String arr[] = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0 ) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        map.entrySet()
            .stream()
            .sorted(Entry.comparingByValue(Comparator.reverseOrder()));


        System.out.print(sb);
    }
}
