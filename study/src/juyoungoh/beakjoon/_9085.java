package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String strArr[] = str.split(" ");

            int sum = 0;

            for (int j = 0; j < strArr.length; j++) {
                sum += Integer.parseInt(strArr[j]);
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
