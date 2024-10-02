package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String arr[] = str.split(" ");

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(Integer.parseInt(arr[i]), i);
        }

        int m = Integer.parseInt(br.readLine());
        String str2 = br.readLine();
        String arr2[] = str2.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (map.containsKey(Integer.parseInt(arr2[i]))) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}
