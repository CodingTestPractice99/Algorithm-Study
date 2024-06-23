package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number; i++) {
            String input = br.readLine();
            String str = String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(input.length() - 1));
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}
