package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _29881 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, String> map1 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            map1.put(str[0], str[1]);
        }

        Map<String, String> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            map2.put(str[0], str[1]);
        }

        for (String s : map1.keySet()) {
            String lastName = map1.get(s);
            String accountName = map2.get(s);
            System.out.println(lastName + " " + accountName);
        }
    }
}
