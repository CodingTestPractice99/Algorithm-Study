package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10156 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int count = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]);

        int sum = a * count;

        if (sum <= b) {
            System.out.println(0);
        } else {
            System.out.println(sum - b);
        }
    }
}
