package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5800 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String arr[] = br.readLine().split(" ");

            int[] class1 = new int[Integer.parseInt(arr[0])];

            for (int j = 0; j < Integer.parseInt(arr[0]); j++) {
                class1[j] = Integer.parseInt(arr[j + 1]);
            }

            Arrays.sort(class1);

            int max = 0;
            for (int j = 1; j < class1.length; j++) {
                int gap = class1[j] - class1[j - 1];
                if (gap > max) {
                    max = gap;
                }
            }
            System.out.println("Class " + (i));
            System.out.println(
                "Max " + class1[class1.length - 1] + ", Min " + class1[0] + ", Largest gap " + max);
        }
    }
}
