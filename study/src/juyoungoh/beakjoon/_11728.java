package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        long aLength = Integer.parseInt(input[0]);
        long bLength = Integer.parseInt(input[1]);
        long abSum = aLength + bLength;

        long bCount = 0;

        long answer[] = new long[(int) abSum];
        long a[] = new long[(int) aLength];
        long b[] = new long[(int) bLength];

        for (int i = 0; i < 1; i++) {
            if (aLength == 1) {
                a[0] = Integer.parseInt(br.readLine());
            } else {
                String[] aInput = br.readLine().split(" ");
                for (int j = 0; j < aInput.length; j++) {
                    a[j] = Integer.parseInt(aInput[j]);
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            if (bLength == 1) {
                b[0] = Integer.parseInt(br.readLine());
            } else {
                String[] bInput = br.readLine().split(" ");
                for (int j = 0; j < bInput.length; j++) {
                    b[j] = Integer.parseInt(bInput[j]);
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            if (i < aLength) {
                answer[i] = a[i];
            } else {
                answer[i] = b[(int) bCount];
                bCount++;
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
