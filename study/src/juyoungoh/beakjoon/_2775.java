package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2775 {

    static int APT[][] = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        makeAPT();

        for (int i = 0; i < num; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(APT[k][n]).append("\n");
        }
        System.out.print(sb);
    }

    public static void makeAPT() {
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; // i층의 1호
            APT[0][i] = i; // 0층의 i호
        }

        for (int i = 1; i < 15; i++) { // 1층 ~ 14층
            for (int j = 2; j < 15; j++) { // 2호 ~ 14호
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
    }
}
