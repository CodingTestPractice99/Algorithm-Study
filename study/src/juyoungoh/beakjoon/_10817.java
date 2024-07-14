package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10817 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int num[] = new int[3];
        String strArray[] = str.split(" ");

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(num);
        System.out.println(num[1]);
    }
}
