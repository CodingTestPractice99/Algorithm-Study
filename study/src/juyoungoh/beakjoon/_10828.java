package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String arr[] = str.split(" ");
            if (arr[0].equals("push")) {
                deque.push(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("top")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peek()).append("\n");
                }
            } else if (arr[0].equals("pop")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peek()).append("\n");
                    deque.pop();
                }
            } else if (arr[0].equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (arr[0].equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
