package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2752 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");

        int number[] = new int[3];
        for (int i = 0; i < num.length; i++) {
            number[i] = Integer.parseInt(num[i]);
        }

        Arrays.sort(number);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number.length; i++) {
            sb.append(number[i]).append(" ");
        }
        System.out.println(sb);
    }
}
