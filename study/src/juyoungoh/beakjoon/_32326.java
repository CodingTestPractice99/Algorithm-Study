package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _32326 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine()) * 3;
        int g = Integer.parseInt(br.readLine()) * 4;
        int b = Integer.parseInt(br.readLine()) * 5;

        System.out.println(r + g + b);
    }
}
