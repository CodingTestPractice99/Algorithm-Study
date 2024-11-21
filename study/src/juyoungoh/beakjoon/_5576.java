package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5576 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nArr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nArr);

        int mArr[] = new int[10];
        for (int i = 0; i < 10; i++) {
           mArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(mArr);
        int n = nArr[7] + nArr[8] + nArr[9];
        int m = mArr[7] + mArr[8] + mArr[9];
        System.out.println(n + " " + m);
    }
}
