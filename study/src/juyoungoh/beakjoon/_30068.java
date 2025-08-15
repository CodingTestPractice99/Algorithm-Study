package juyoungoh.beakjoon;

import java.io.*;
import java.util.*;

public class _30068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> inTime = new HashMap<>();
        List<String> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int time = Integer.parseInt(s[0]);
            int car = Integer.parseInt(s[1]);

            if (!inTime.containsKey(car)) {
                // 첫 등장 → 입차
                inTime.put(car, time);
            } else {
                // 두 번째 등장 → 출차
                int parkedTime = time - inTime.get(car);
                results.add(car + " " + parkedTime);
                inTime.remove(car); // 필요시 제거
            }
        }

        // 결과 출력
        for (String line : results) {
            System.out.println(line);
        }
    }
}
