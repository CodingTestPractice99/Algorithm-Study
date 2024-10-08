package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _8979 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        Map<Integer, List<Integer>> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String arr[] = br.readLine().split(" ");
            map.put(Integer.parseInt(arr[0]), new ArrayList<>());
            map.get(Integer.parseInt(arr[0])).add(Integer.parseInt(arr[1]));
            map.get(Integer.parseInt(arr[0])).add(Integer.parseInt(arr[2]));
            map.get(Integer.parseInt(arr[0])).add(Integer.parseInt(arr[3]));
        }

    }
}
