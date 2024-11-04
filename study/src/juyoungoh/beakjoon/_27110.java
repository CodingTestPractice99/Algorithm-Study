package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String arr[] = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        int a2 = 0;
        int b2 = 0;
        int c2 = 0;

        if (n <= a) {
            a2 = n;
        } else if (a / n >= 1) {
            a2 = (a / n) * n;
        } else {
            a2 = a;
        }

        if (n <= b) {
            b2 = n;
        } else if (b / n >= 1) {
            b2 = (b / n) * n;
        } else {
            b2 = b;
        }

        if (n <= c) {
            c2 = n;
        } else if (c / n >= 1) {
            c2 = (c / n) * n;
        } else {
            c2 = c;
        }

        int answer = a2 + b2 + c2;

        System.out.println(answer);
    }
}
