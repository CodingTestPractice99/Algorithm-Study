package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int number[] = new int[count];

        for (int i = 0; i < count; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(number);

        StringBuilder sb = new StringBuilder();
        for (int i : number) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}
