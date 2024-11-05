package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _14235 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (!str.equals("0")) {
                String[] s = str.split(" ");
                int num = Integer.parseInt(s[0]);
                for (int j = 1; j <= num; j++) {
                    pq.offer(Integer.parseInt(s[j]));
                }
            } else if ((!pq.isEmpty()) && str.equals("0")) {
                sb.append(pq.poll()).append("\n");
            } else {
                sb.append(-1).append("\n");
            }
        }
        System.out.print(sb);
    }
}
