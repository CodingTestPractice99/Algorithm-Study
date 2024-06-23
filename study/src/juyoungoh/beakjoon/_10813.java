package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");

        int basketNum = Integer.parseInt(input[0]);
        int ballCountNum = Integer.parseInt(input[1]);
        int temp = 0;

        int basketInBall[] = new int[basketNum];

        for (int i = 0; i < basketInBall.length; i++) {
            basketInBall[i] = (i + 1);
        }

        for (int i = 0; i < ballCountNum; i++) {
            String inputBallShake[] = br.readLine().split(" ");
            int indexOne = Integer.parseInt(inputBallShake[0]);
            int indexTwo = Integer.parseInt(inputBallShake[1]);
            temp = basketInBall[indexOne - 1];
            basketInBall[indexOne - 1] = basketInBall[indexTwo - 1];
            basketInBall[indexTwo - 1] = temp;
            temp = 0;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < basketInBall.length; i++) {
            sb.append(basketInBall[i]).append(" ");
        }
        System.out.println(sb);
    }
}
