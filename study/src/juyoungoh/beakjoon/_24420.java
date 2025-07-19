package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _24420 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(num);

        int answer = 0;
        for (int i = 1; i < num.length - 1; i++) {
            answer += num[i];
        }
        System.out.println(answer);
    }
}
