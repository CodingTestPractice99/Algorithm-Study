package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String arr[] = br.readLine().split(" ");
        int arrN[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrN[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arrN);

        int left = 0;
        int right = arrN.length - 1;

        int answer = 0;

        while (left < right) {
            if (arrN[left] + arrN[right] < m) {
                left += 1;
            } else if (arrN[left] + arrN[right] > m) {
                right -= 1;
            } else {
                answer++;
                left += 1;
                right -= 1;
            }
        }
        System.out.println(answer);
    }

}
