package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class _17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();

        int number[] = new int[n];
        String str[] = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(str[i]);
        }

        int answer[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && number[i] > number[stack.peek()]) {
                int index = stack.pop();
                answer[index] = number[i];
            }
            stack.push(i);
        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.print(sb);
    }
}
