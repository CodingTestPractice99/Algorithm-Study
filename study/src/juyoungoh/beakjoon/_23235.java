package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23235 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        while (true) {
            String s = br.readLine();
            n++;
            if (s.equals("0")) {
                break;
            }
            System.out.println("Case " + n + ": Sorting... done!");
        }
    }
}
