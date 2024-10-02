package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10822 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String arr[] = str.split(",");
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Long.parseLong(arr[i]);
        }
        System.out.println(sum);
    }
}
