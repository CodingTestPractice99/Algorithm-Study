package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11283 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = br.readLine().charAt(0);
        int index = (ch - 0xAC00) + 1;
        System.out.println(index);
    }
}
