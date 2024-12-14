package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _18679 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String arr[] = br.readLine().split(" = ");
            map.put(arr[0], arr[1]);
        }

        StringBuilder sb = new StringBuilder();
        int n2 = Integer.parseInt(br.readLine());
        for (int i = 0; i < n2; i++) {
            int m = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                sb.append(map.get(str[j])).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
