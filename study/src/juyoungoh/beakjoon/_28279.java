package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _28279 {

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
                    deque.addFirst(b);
                } else if (a == 2) {
                    deque.addLast(b);
                }
            } else {
                if (str.equals("3")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.removeFirst()).append("\n");
                    }
                } else if (str.equals("4")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.removeLast()).append("\n");
                    }
                } else if (str.equals("5")) {
                    sb.append(deque.size()).append("\n");
                } else if (str.equals("6")) {
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                } else if (str.equals("7")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                } else if (str.equals("8")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                }
            }
        }
        System.out.print(sb);
    }
}
