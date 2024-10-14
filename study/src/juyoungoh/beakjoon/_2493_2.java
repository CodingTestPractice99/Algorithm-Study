package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Top2 {

    int number;
    int height;

    public Top2(int number, int height) {
        this.number = number;
        this.height = height;
    }
}

public class _2493_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Top2> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            int height = Integer.parseInt(st.nextToken());

            if (stack.isEmpty()) {
                sb.append(0).append(" ");
                stack.push(new Top2(i, height));
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        sb.append(0).append(" ");
                        stack.push(new Top2(i, height));
                        break;
                    }

                    Top2 top = stack.peek();

                    if (top.height > height) {
                        sb.append(top.number).append(" ");
                        stack.push(new Top2(i, height));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        System.out.print(sb.toString().trim());
    }
}
