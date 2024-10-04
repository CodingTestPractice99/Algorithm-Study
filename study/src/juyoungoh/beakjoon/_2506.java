package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String arr[] = br.readLine().split(" ");

        int answer = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("1")) {
                count++;
                answer += count;
            } else {
                count = 0;
            }
        }
        System.out.println(answer);
    }
}
