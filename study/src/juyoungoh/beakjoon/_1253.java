package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String arr[] = br.readLine().split(" ");
        int numArr[] = new int[arr.length];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
            set.add(Integer.parseInt(arr[i]));
        }

        Arrays.sort(numArr);
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        int a = 0;
        int b = 0;

        while (left < right) {
            long sum = numArr[left] + numArr[right];

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
        System.out.println(n - set.size());
    }
}
