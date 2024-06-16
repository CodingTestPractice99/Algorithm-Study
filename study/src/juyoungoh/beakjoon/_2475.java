package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = (br.readLine().split(" "));
        int num[] = new int[5];
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]) * Integer.parseInt(str[i]);
        }

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        answer = sum % 10;
        System.out.println(answer);
    }
}
