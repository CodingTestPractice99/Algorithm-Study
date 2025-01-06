package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _17608 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.addLast(Integer.parseInt(br.readLine()));
        }

        int maxHeight = 0;
        int count = 0;

        while (!stack.isEmpty()) {
            int currentHeight = stack.pollLast();
            if (currentHeight > maxHeight) {
                maxHeight = currentHeight;
                count++;
            }
        }
        System.out.println(count);
    }
}
