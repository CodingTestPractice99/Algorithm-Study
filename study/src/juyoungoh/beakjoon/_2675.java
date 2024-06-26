package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputNum; i++) {
            String input[] = br.readLine().split(" ");
            int count = Integer.parseInt(input[0]);
            String str = input[1];
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < count; k++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
