package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2576 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number[] = new int[7];
        for (int i = 0; i < 7; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int count = 0;
        int index = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                sum += number[i];
                count++;
            }
        }

        int num[] = new int[count];

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                num[index] = number[i];
                index++;
            }
        }

        if (sum == 0) {
            sum = -1;
            System.out.println(sum);
            return;
        }

        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
