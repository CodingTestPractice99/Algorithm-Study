package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _27964 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith("Cheese")) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }
        if (map.size() >= 4) {
            System.out.println("yummy");
        } else {
            System.out.println("sad");
        }
    }
}
