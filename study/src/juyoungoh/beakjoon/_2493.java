package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _2493 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] number = new int[n];
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        // 각 탑의 높이를 배열에 저장
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(arr[i]);
        }

        // 스택을 이용하여 각 탑이 신호를 수신할 탑을 찾음
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && number[stack.peek()] < number[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                answer[i] = stack.peek() + 1; // 수신한 탑의 번호 (1-based)
            }
            stack.push(i); // 현재 탑을 스택에 넣음
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();

        for (int i : answer) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
