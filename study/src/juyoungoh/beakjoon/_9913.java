package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9913 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num[] = new int[1001];

        for (int i = 0; i < n; i++) {
            int num2 = Integer.parseInt(br.readLine());
            num[num2]++;
        }

        int max = 0;
        for (int i = 1; i <= 1000; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
