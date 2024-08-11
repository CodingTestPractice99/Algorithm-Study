package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num[] = new int[5];

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        int a = sum / 5;

        Arrays.sort(num);

        System.out.println(a);
        System.out.println(num[2]);
    }
}
