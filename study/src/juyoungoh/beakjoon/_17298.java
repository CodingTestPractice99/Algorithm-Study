package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        if (n == 1) {
            System.out.println(-1);
            return;
        }

        String str = br.readLine();
        String arr[] = str.split(" ");

        long num[] = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            num[i] = Long.parseLong(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    sb.append(num[j]).append(" ");
                    break;
                } else if (num.length - 1 == j) {
                    sb.append(-1).append(" ");
                }
            }
        }

        sb.append(-1);
        System.out.print(sb);
    }
}
