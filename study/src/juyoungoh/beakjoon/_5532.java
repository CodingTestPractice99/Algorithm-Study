package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int day = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int aDay = 0;
        int bDay = 0;

        if (a % c == 0) {
            aDay = a / c;
        } else {
            aDay = a / c + 1;
        }

        if (b % d == 0) {
            bDay = b / d;
        } else {
            bDay = b / d + 1;
        }

        if (aDay > bDay) {
            System.out.println(day - aDay);
        } else if (bDay > aDay) {
            System.out.println(day - bDay);
        } else {
            System.out.println(day - bDay);
        }
    }
}
