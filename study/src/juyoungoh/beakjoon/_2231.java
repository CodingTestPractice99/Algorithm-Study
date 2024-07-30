package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();

        int numLength = inputStr.length();
        int answer = Integer.parseInt(inputStr);

        for (int i = answer - (numLength * 9); i < answer; i++) {
            int num = i;
            int sum = i;
            int num2 = 0;
            while(num != 0) {
                num2 = num % 10;
                sum += num2;
                num /= 10;
                num2 = 0;
            }
            if (sum == answer) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }
}

