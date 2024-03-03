package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int student[] = new int[31];

        for (int i = 1; i <= 28; i++) {
            student[Integer.parseInt(br.readLine())] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (student[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
