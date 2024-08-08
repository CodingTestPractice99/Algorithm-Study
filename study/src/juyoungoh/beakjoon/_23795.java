package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23795 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long sum = 0;
        while (true) {
            String str = br.readLine();
            if (str.equals("-1")) {
                break;
            }
            sum += Long.parseLong(str);
        }
        System.out.println(sum);
    }
}
