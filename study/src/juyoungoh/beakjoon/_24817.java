package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _24817 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }

        Set<String> winners = new HashSet<>();
        boolean hasWinners = false;

        for (int i = 0; i < z; i++) {
            String[] log = br.readLine().split(" ");
            String name = log[0];
            int pts = Integer.parseInt(log[1]);

            map.put(name, map.get(name) + pts);

            if (map.get(name) >= m && !winners.contains(name)) {
                System.out.println(name + " wins!");
                winners.add(name);
                hasWinners = true;
            }
        }
        if (!hasWinners) {
            System.out.println("No winner");
        }
    }
}
