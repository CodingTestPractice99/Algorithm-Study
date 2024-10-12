package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2711 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str[] = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            String s = str[1];

            String arr[] = new String[s.length() - 1];

            int index = 0;

            char[] c = s.toCharArray();

            for (int j = 0; j < c.length; j++) {
                if (j == n - 1) {
                    continue;
                } else {
                    arr[index] = String.valueOf(c[j]);
                    index++;
                }
            }

            index = 0;
            String answer = "";
            for (int j = 0; j < arr.length; j++) {
                answer += arr[j];
            }
            System.out.println(answer);
        }
    }
}
