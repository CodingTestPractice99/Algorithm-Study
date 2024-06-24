package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2822 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score[] = new int[8]; // 정렬 전 점수
        int scoreSort[] = new int[8]; // 오름차순 점수
        int answer[] = new int[5]; // 상위 5개 점수

        int index = 0;
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < score.length; i++) {
            scoreSort[i] = score[i];
        }

        Arrays.sort(scoreSort);

        for (int i = 0; i < scoreSort.length - 5; i++) {
            scoreSort[i] = -1;
        }

        for (int i = 0; i < scoreSort.length; i++) {
            if (scoreSort[i] != -1) {
                sum += scoreSort[i];
            }
        }
        System.out.println(sum);

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (scoreSort[i] == score[j]) {
                    answer[index] = j + 1;
                    index++;
                }
            }
        }

        Arrays.sort(answer);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}
