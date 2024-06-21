package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10810 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int basketNum = Integer.parseInt(num[0]);
        int ballCount = Integer.parseInt(num[1]);

        int ballGame[] = new int[basketNum];

        for (int i = 0; i < ballCount; i++) {
            String[] input = br.readLine().split(" ");
            int index1 = Integer.parseInt(input[0]);
            int index2 = Integer.parseInt(input[1]);
            int ballNum = Integer.parseInt(input[2]);
            for (int j = index1 - 1; j < index2; j++) {
                ballGame[j] = ballNum;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ballGame.length; i++) {
            sb.append(ballGame[i]).append(" ");
        }
        System.out.println(sb);
    }
}
