package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26040 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split("");
        String arr[] = br.readLine().split(" ");

        String string = "";

        for (int i = 0; i < arr.length; i++) {
            string += arr[i];
        }

        String answer = "";
        for (int i = 0; i < str.length; i++) {
            if (string.contains(str[i])) {
                answer += str[i].toLowerCase();
            } else {
                answer += str[i];
            }
        }
        System.out.println(answer);
    }
}
