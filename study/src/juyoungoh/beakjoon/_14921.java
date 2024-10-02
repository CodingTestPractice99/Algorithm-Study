package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14921 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String arr[] = br.readLine().split(" ");
        if (n == 2) {
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            return;
        }

        int arrNum[] = new int[arr.length];

        for (int i = 0; i < n; i++) {
            arrNum[i] = Integer.parseInt(arr[i]);
        }


        int left = 0;
        int right = arrNum.length - 1;

        int result = Integer.MAX_VALUE;

        while (left < right) {
            int sum = arrNum[left] + arrNum[right];

            if (Math.abs(sum) < Math.abs(result)) {
                result = sum;
            }
            if (sum == 0) {
                result = 0;
                break;
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(result);
    }
}
