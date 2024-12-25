package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _14544 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            String str[] = br.readLine().split(" ");
            int n2 = Integer.parseInt(str[1]);
            int n3 = Integer.parseInt(str[0]);

            for (int j = 0; j < n3; j++) {
                String str2 = br.readLine();
            }
            for (int j = 0; j < n2; j++) {
                String str3[] = br.readLine().split(" ");
                map.put(str3[0], map.getOrDefault(str3[0], 0) + Integer.parseInt(str3[1]));
            }

            int max = 0;
            for (Integer value : map.values()) {
                if (max < value) {
                    max = value;
                }
            }

            int maxCount = 0;
            String winner = "";
            for (Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) {
                    maxCount++;
                    winner = entry.getKey();
                }
            }
            if (maxCount == 1) {
                System.out.println("VOTE " + (i + 1) + ": " + "THE WINNER IS " + winner + " " + max);
            } else {
                System.out.println("VOTE " + (i + 1) + ": " + "THERE IS A DILEMMA");
            }
        }
    }
}
