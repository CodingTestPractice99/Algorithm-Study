package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int decimal = Integer.parseInt(str, 8);
        String binary = Integer.toBinaryString(decimal);

        System.out.println(binary);
    }
}
