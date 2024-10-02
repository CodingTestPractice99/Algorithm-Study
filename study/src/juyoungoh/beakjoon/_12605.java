package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12605 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            String arr[] = str.split(" ");

            String str2 = "";
            for (int j = arr.length - 1; j >= 0; j--) {
                str2 += (" " + arr[j]);
            }
            System.out.println("Case #" + i + ":" + str2);
        }
    }
}
