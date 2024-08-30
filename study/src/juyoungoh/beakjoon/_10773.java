package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            if (m != 0) {
                deque.push(m);
            } else if (m == 0) {
                deque.pop();
            }
        }

        int answer = 0;
        for (Integer integer : deque) {
            answer += integer;
        }
        System.out.println(answer);
    }
}
