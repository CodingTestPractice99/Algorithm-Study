package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        double number[] = new double[num];

        double sum = 0;

        String input[] = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            number[i] = Integer.parseInt(input[i]);
        }

        double max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }

        for (int i = 0; i < number.length; i++) {
            sum += (number[i] / max) * (double) 100;
        }

        double answer = sum / num;
        System.out.println(answer);
    }
}
