package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21955 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int mid = s.length() / 2;

        String first = s.substring(0, mid);
        String second = s.substring(mid);

        System.out.println(first + " " + second);
    }
}
