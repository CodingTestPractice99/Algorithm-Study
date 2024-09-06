package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str2 = br.readLine();
            String str[] = str2.split(" ");
            if (str.length == 2) {
                if (str[0].equals("push_front")) {
                    deque.offerFirst(Integer.parseInt(str[1]));
                } else if (str[0].equals("push_back")) {
                    deque.offerLast(Integer.parseInt(str[1]));
                }
            } else {
                if (str2.equals("pop_front")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                        deque.pollFirst();
                    }
                } else if (str2.equals("pop_back")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                        deque.pollLast();
                    }
                } else if (str2.equals("size")) {
                    sb.append(deque.size()).append("\n");
                } else if (str2.equals("empty")) {
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                } else if (str2.equals("front")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                } else if (str2.equals("back")) {
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
