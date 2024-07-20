package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int sum = A * B * C;
        String strSum = String.valueOf(sum);
        char charSum[] = strSum.toCharArray();

        String number[] = new String[10];
        number[0] = "0";
        number[1] = "1";
        number[2] = "2";
        number[3] = "3";
        number[4] = "4";
        number[5] = "5";
        number[6] = "6";
        number[7] = "7";
        number[8] = "8";
        number[9] = "9";

        int number2[] = new int[10];
        for (int i = 0; i < strSum.length(); i++) {
            for (int j = 0; j < number.length; j++) {
                if (String.valueOf(charSum[i]).equals(number[j])) {
                    number2[j] += 1;
                }
            }
        }

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
    }
}
