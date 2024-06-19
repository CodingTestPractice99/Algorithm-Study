package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2442 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String star = "*";
        String blank = " ";
        int count = 0;

        for (int i = 1; i <= n; i++) { // 행 1, 2, 3, 4, 5
            count = i + 2;
            for (int j = n; j > i; j++) { // 4, 3, 2, 1
                System.out.print(blank);
            }
            if (i == 1) {
                System.out.print(star);
            } else {
                while (true) {
                    if (count <= 0) {
                        break;
                    }
                    System.out.print(star);
                    count--;
                }
            }
            System.out.println();
        }
    }
}
