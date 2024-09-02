package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _12605_1 {

    public static void main(String[] args) throws IOException {
        Deque<String> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                deque.push(st.nextToken());
            }
            sb.append("Case #" + i + ": ");
            while (!deque.isEmpty()) {
                sb.append(deque.pop() + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
