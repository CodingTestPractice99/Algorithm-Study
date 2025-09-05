package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25915 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char start = br.readLine().charAt(0);

        String password = "ILOVEYONSEI";
        int cur = start - 'A';
        int total = 0;

        for (int i = 0; i < password.length(); i++) {
            int target = password.charAt(i) - 'A';
            total += Math.abs(cur - target);
            cur = target;
        }

        System.out.println(total);
    }
}
