package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class _9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>() {{
            put(")", "(");
        }};

        int t = Integer.parseInt(br.readLine());
        Deque<String> stack = new ArrayDeque<>();
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String arr[] = br.readLine().split("");
            for (int j = 0; j < arr.length; j++) {
                if (!map.containsKey(arr[j])) {
                    stack.push(arr[j]);
                } else if (stack.isEmpty() || map.get(arr[j]) != stack.pop()) {
                    sb.append("NO").append("\n");
                    count++;
                    stack.clear();
                    break;
                }
            }
            if (stack.size() == 0 && count <= i) {
                count++;
                sb.append("YES").append("\n");
            } else if (count < i) {
                count++;
                sb.append("NO").append("\n");
            }
            stack.clear();
        }
        System.out.print(sb);
    }
}
