package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14921_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");

        if (n == 2) {
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            return;
        }

        int numArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        int left = 0;
        int right = n - 1;
        int answer = Integer.MAX_VALUE;

        while (left < right) {
            int sum = numArr[left] + numArr[right];
            if (Math.abs(sum) < Math.abs(answer)) {
                answer = sum;
            }
            if (sum == 0) {
                answer = 0;
                break;
            } else if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            }
        }
        System.out.println(answer);
    }
}
