package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _2161 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(n);
            return;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.offerLast(i);
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.removeFirst()).append(" ");
            if (deque.size() > 0) {
                deque.offerLast(deque.peekFirst());
                deque.removeFirst();
            }
        }
        System.out.print(sb);
    }
}
