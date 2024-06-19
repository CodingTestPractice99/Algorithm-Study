package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10039 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer[] = new int[5];
        int average = 0;

        for (int i = 0; i < 5; i++) {
            answer[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] < 40) {
                answer[i] = 40;
                average += answer[i];
            } else {
                average += answer[i];
            }
        }

        System.out.println(average / 5);
    }
}
