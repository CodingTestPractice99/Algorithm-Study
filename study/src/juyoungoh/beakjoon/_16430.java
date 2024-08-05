package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());

        int one2 = two - one;
        int two2 = two;

        System.out.println(one2 + " " + two2);
    }
}
