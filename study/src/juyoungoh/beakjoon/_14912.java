package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number[] = br.readLine().split(" ");
        int num = Integer.parseInt(number[0]);
        String str = "";

        int answer = 0;
        for (int i = 1; i <= num; i++) {
            str += String.valueOf(i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(number[1])) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
