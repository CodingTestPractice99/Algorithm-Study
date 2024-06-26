package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");

        int arrayLength = input.length;
        int blankCount = 0;

        for (int i = 0; i < input.length; i++) {
             if (input[i].isBlank())  {
                 blankCount++;
             }
        }
        System.out.println(arrayLength - blankCount);
    }
}
