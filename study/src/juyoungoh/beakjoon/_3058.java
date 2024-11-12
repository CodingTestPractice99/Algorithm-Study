package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class _3058 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            int sum = 0;
            int min = 0;
            int num[] = new int[str.length];
            for (int j = 0; j < str.length; j++) {
                num[j] = Integer.parseInt(str[j]);
            }
            Arrays.sort(num);
            for (int j = 0; j < num.length; j++) {
                if (num[j] % 2 == 0) {
                    min = num[j];
                    break;
                }
            }

            for (int j = 0; j < num.length; j++) {
                if (num[j] % 2 == 0) {
                    sum += num[j];
                }
            }

            System.out.println(sum + " " + min);
            sum = 0;
            min = 0;
        }
    }
}
