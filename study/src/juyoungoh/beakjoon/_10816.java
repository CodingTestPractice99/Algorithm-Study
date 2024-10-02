package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String arr[] = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        String str2 = br.readLine();
        String arr2[] = str2.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (map.containsKey(arr2[i])) {
                sb.append(map.get(arr2[i])).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.print(sb);
    }
}
