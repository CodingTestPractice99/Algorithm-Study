package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String arr[] = str.split(" ");
            if (arr.length == 2) {
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                if (a == 1) {
                    deque.push(b);
                }
            }
             else if (Integer.parseInt(str) == 2) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pop()).append("\n");
                }
            } else if (Integer.parseInt(str) == 3) {
                sb.append(deque.size()).append("\n");
            } else if (Integer.parseInt(str) == 4) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (Integer.parseInt(str) == 5) {
                if (!(deque.isEmpty())) {
                    sb.append(deque.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
