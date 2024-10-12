package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _17298_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int[] number = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && number[stack.peek()] < number[i]) {
                number[stack.pop()] = number[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            number[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(number[i]).append(" ");
        }
        System.out.print(sb);
    }
}
