package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int number[] = new int[n];
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        int max = number[0];
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            } else if (number[i] < min) {
                min = number[i];
            }
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}

