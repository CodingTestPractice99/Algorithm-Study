package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26068 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String arr[] = str.split("-");
            int day = Integer.parseInt(arr[1]);
            if (day <= 90) {
                count++;
            }
        }

        System.out.println(count);
    }
}
