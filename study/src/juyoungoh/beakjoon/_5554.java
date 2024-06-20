package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5554 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int sum = a + b + c + d;

        int minutes = 0;
        int seconds = 0;
        if (sum % 60 != 0) {
            minutes = sum / 60;
            seconds = sum % 60;
        } else {
            minutes = sum / 60;
        }
        System.out.println(minutes);
        System.out.println(seconds);
    }
}
