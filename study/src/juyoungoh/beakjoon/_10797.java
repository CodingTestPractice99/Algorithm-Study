package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10797 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        String str[] = br.readLine().split(" ");

        int strNum[] = new int[str.length];

        for (int i = 0; i < strNum.length; i++) {
            strNum[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < strNum.length; i++) {
            if (strNum[i] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
