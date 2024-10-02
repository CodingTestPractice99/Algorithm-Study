package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String arr[] = str.split(" ");
        int x = Integer.parseInt(br.readLine());
        int arrNum[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrNum[i] = Integer.parseInt(arr[i]);
        }

        int left = 0;
        int right = arr.length - 1;

        int answer = 0;

        Arrays.sort(arrNum);
        while (left < right) {
            if (arrNum[left] + arrNum[right] < x) {
                left += 1;
            } else if (arrNum[left] + arrNum[right] > x) {
                right -= 1;
            } else if (arrNum[left] + arrNum[right] == x) {
                answer++;
                left += 1;
                right -= 1;
            }
        }
        System.out.println(answer);
    }
}
