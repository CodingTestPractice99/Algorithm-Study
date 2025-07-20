package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24074 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num[] = new int[n];
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(s[i]);
        }

        int maxVal = num[0];
        int maxIdx = 0;

        for (int i = 1; i < n; i++) {
            if (num[i] > maxVal) {
                maxVal = num[i];
                maxIdx = i;
            }
        }
        int sumBefore = 0;
        for (int j = 0; j < maxIdx; j++) {
            sumBefore += num[j];
        }

        int sumAfter = 0;
        for (int i = maxIdx + 1; i < n; i++) {
            sumAfter += num[i];
        }

        System.out.println(sumBefore);
        System.out.println(sumAfter);
    }
}

