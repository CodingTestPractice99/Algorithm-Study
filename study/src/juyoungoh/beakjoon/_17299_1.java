package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _17299_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count[] = new int[1_000_001];
        int number[] = new int[n];
        int answer[] = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        String str[] = br.readLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            number[i] = Integer.parseInt(str[i]);
            count[number[i]]++;
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && count[number[i]] > count[number[stack.peek()]]) {
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
        for (int i : answer) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }
}
