package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2953 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        for (int i = 1; i <= 5; i++) {
            String arr[] = br.readLine().split(" ");

            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += Integer.parseInt(arr[j]);
            }
            if (max < sum) {
                index = i;
                max = sum;
            }
        }
        System.out.println(index + " " + max);
    }
}
