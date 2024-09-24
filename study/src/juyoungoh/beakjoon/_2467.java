package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2467 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");

        int a = 0;
        int b = 0;

        int left = 0;
        int right = n - 1;

        int numArr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numArr);

        long result = Long.MAX_VALUE;

        while (left < right) {
            long sum = numArr[left] + numArr[right];

            if (Math.abs(sum) < Math.abs(result)) {
                result = sum;
                a = numArr[left];
                b = numArr[right];
            }

            if (sum == 0) {
                a = numArr[left];
                b = numArr[right];
                break;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(a + " " + b);
    }
}
