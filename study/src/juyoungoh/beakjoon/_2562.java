package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number[] = new int[9];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
                index = i + 1;
            }
        }
        sb.append(max).append("\n").append(index);
        System.out.println(sb);
    }
}
