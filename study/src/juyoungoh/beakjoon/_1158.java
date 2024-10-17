package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1158 {

    int[] q;
    int front = 0, rear = -1, len = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");

        int num = Integer.parseInt(arr[0]);
        int count = Integer.parseInt(arr[1]);

        int answer[] = new int[num];
        int number[] = new int[num];

        for (int i = 0; i < num; i++) {
            number[i] = i + 1;
        }






    }

}
