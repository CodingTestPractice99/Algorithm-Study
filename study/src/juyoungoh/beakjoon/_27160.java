package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _27160 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String arr[] = br.readLine().split(" ");
            String str = arr[0];
            int number = Integer.parseInt(arr[1]);

            map.put(str, map.getOrDefault(str, 0) + number);
        }

        int index = 0;
        for (int value : map.values()) {
            if (value == 5) {
                index = 1;
                break;
            }
        }

        if (index == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
