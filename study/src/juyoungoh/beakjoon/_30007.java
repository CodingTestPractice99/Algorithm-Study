package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30007 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String arr[] = br.readLine().split(" ");
            int arrInt[] = new int[arr.length];

            for (int j = 0; j < arr.length; j++) {
                arrInt[j] = Integer.parseInt(arr[j]);
            }

            int answer = (arrInt[0] * (arrInt[2] - 1)) + arrInt[1];
            System.out.println(answer);
        }
    }
}
